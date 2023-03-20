package com.itm.advice.notificationservice.exception.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.security.Principal;

@Tag(name = "Example Controller", description = "Тестовый контроллер")
public interface ExampleController {

    @Operation(summary = "example", description = "Пример работы с user-service")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Возвращает Id авторизованного пользователя")
    })
    String example(Principal principal);
}
