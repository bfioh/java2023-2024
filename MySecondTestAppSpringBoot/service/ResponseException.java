package ru.mikov.MySecondTestAppSpringBoot.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.mikov.MySecondTestAppSpringBoot.model.Request;
import ru.mikov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ResponseException {
    ResponseEntity<Response> ResponseExceptions(Request request, BindingResult bindingResult);
}