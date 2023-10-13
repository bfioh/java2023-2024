package ru.mikov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.mikov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}