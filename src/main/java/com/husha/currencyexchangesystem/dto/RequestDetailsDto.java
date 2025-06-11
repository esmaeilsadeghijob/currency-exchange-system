package com.husha.currencyexchangesystem.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RequestDetailsDto {
    private String uuid;
    private String currencySymbol;
    private String status;
    private String payType;
    private String registeredAt;
    private String userName;
    private String userNationalCode;
    private List<String> documents;
}
