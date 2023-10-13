package ru.mikov.MySecondTestAppSpringBoot.service;

import lombok.extern.slf4j.Slf4j;
import ru.mikov.MySecondTestAppSpringBoot.model.Response;
import ru.mikov.MySecondTestAppSpringBoot.util.DateTimeUtil;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
@Qualifier("ModifySystemTimeResponseService")
public class ModifySystemTimeResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormatFormat().format(new Date()));
        return response;
    }
}