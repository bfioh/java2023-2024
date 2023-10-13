package ru.mikov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mikov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.mikov.MySecondTestAppSpringBoot.model.Request;

import java.util.Objects;

@Service
public class RequestUnsatedException implements UnsupportedCodeService {

    @Override
    public void isCode(Request request) throws UnsupportedCodeException {
        if (Objects.equals(request.getUid(),"123")){
            throw new UnsupportedCodeException("значение UID не должно быть = 123");
        }
    }
}