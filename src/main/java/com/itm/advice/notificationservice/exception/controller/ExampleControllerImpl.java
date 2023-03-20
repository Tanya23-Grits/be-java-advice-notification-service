package com.itm.advice.notificationservice.exception.controller;

import com.itm.advice.notificationservice.exception.service.ExampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class ExampleControllerImpl implements ExampleController {

    private final ExampleService exampleService;

    @GetMapping("/user-service")
    @Secured("ROLE_MODERATOR")
    public String example(Principal principal) {
        return exampleService.getPrincipalName(principal);
    }
}
