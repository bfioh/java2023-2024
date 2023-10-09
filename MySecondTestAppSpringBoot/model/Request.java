package ru.mikov.MySecondTestAppSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    @Size(max = 32)
    private String uid;

    @NotBlank
    @Size(max = 32)
    private String operationUid;
    private String systemName;
    @NotBlank
    private String systemTime;
    private String source;

    @Range(min = 1, max = 100000, message = "Значение должно быть в диапазоне от 1 до 100000")
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;


}