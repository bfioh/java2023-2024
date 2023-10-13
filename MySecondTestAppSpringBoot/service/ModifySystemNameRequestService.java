package ru.mikov.MySecondTestAppSpringBoot.service;

import ru.mikov.MySecondTestAppSpringBoot.model.Systems;
import ru.mikov.MySecondTestAppSpringBoot.model.Request;
import ru.mikov.MySecondTestAppSpringBoot.service.ModifyRequestService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@Qualifier("SystemName")
public class ModifySystemNameRequestService implements ModifyRequestService {
    @Override
    public void modify(Request request) {

        request.setSystemName(Systems.SERVICE_ONE);

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}