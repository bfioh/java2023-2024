package ru.mikov.MySecondTestAppSpringBoot.service;

import ru.mikov.MySecondTestAppSpringBoot.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}