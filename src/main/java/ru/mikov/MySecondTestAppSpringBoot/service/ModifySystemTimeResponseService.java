package ru.mikov.MySecondTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import ru.mikov.MySecondTestAppSpringBoot.model.Response;
import ru.mikov.MySecondTestAppSpringBoot.util.DateTimeUtil;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));

        log.info("modify response: {}", response);

        return response;
    }
}