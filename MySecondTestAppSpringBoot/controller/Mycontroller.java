package ru.mikov.MySecondTestAppSpringBoot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mikov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.mikov.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import ru.mikov.MySecondTestAppSpringBoot.model.*;
import ru.mikov.MySecondTestAppSpringBoot.service.ModifyResponseService;
import ru.mikov.MySecondTestAppSpringBoot.service.ResponseException;
import ru.mikov.MySecondTestAppSpringBoot.service.ValidationService;
import ru.mikov.MySecondTestAppSpringBoot.util.DateTimeUtil;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@RestController
public class Mycontroller {

    private final ResponseException responseException;

    @Autowired
    public Mycontroller( ResponseException responseException) {
        this.responseException = responseException;
    }

    @PostMapping(value = "/feedback")
    public void feedback(@Valid @RequestBody Request request, BindingResult bindingResult) {
        log.info("request:{}",request);
        responseException.ResponseExceptions(request,bindingResult);

    }
}