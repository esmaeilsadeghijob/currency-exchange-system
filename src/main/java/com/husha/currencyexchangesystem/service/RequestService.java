package com.husha.currencyexchangesystem.service;

import com.husha.currencyexchangesystem.dto.RequestDetailsDto;
import com.husha.currencyexchangesystem.dto.RequestDto;
import com.husha.currencyexchangesystem.entity.Request;
import com.husha.currencyexchangesystem.repository.RequestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<RequestDto> getAllRequests(String status) {
        List<Request> requests = requestRepository.findByStatus(status);
        return requests.stream().map(this::convertToDto).toList();
    }

    public RequestDetailsDto getRequestDetails(String uuid) {
        Request request = requestRepository.findByUuid(uuid)
                .orElseThrow(() -> new RuntimeException("درخواست یافت نشد"));

        return convertToDetailsDto(request);
    }

    private RequestDto convertToDto(Request request) {
        RequestDto dto = new RequestDto();
        dto.setUuid(request.getUuid());
        dto.setCurrencySymbol(request.getCurrencySymbol());
        dto.setStatus(request.getStatus());
        dto.setPayType(request.getPayType());
        dto.setRegisteredAt(request.getRegisteredAt().toString());
        return dto;
    }

    private RequestDetailsDto convertToDetailsDto(Request request) {
        RequestDetailsDto dto = new RequestDetailsDto();
        dto.setUuid(request.getUuid());
        dto.setCurrencySymbol(request.getCurrencySymbol());
        dto.setStatus(request.getStatus());
        dto.setPayType(request.getPayType());
        dto.setRegisteredAt(request.getRegisteredAt().toString());
        dto.setUserName(request.getUserName());
        dto.setUserNationalCode(request.getUserNationalCode());
        return dto;
    }
}
