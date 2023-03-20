package com.itm.advice.notificationservice.exception.service;

import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String getPrincipalName(Principal principal) {
        return principal.getName();
    }
}
