package ru.mikov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mikov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.mikov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface UnsupportedCodeService {
    void isCode(Request request) throws UnsupportedCodeException;
}