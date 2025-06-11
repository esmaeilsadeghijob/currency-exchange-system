package com.husha.currencyexchangesystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {
    private String uuid;
    private String currencySymbol;
    private String status;
    private String payType;
    private String registeredAt;
}
