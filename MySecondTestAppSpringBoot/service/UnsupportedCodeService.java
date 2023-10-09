package ru.mikov.MySecondTestAppSpringBoot.service;
import org.springframework.stereotype.Service;
import ru.mikov.MySecondTestAppSpringBoot.exception.UnsupportedCodeException;


@Service
public interface UnsupportedCodeService {

    void isValid(String s) throws UnsupportedCodeException;
}