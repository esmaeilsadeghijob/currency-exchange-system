package com.husha.currencyexchangesystem.controller;

import com.husha.currencyexchangesystem.dto.RequestDto;
import com.husha.currencyexchangesystem.dto.RequestDetailsDto;
import com.husha.currencyexchangesystem.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class RequestController {
    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping
    public ResponseEntity<List<RequestDto>> getRequests(@RequestParam(required = false) String status) {
        List<RequestDto> requestDtos = requestService.getAllRequests(status);
        return ResponseEntity.ok(requestDtos);
    }


    @GetMapping("/show/{uuid}")
    public ResponseEntity<RequestDetailsDto> getRequestDetails(@PathVariable String uuid) {
        RequestDetailsDto requestDetails = requestService.getRequestDetails(uuid);
        return ResponseEntity.ok(requestDetails);
    }

}
