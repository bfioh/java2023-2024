package ru.mikov.MySecondTestAppSpringBoot.service;

import ru.mikov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.mikov.MySecondTestAppSpringBoot.exception.ValidationFailedException;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException, UnsupportedCodeException;
}