package com.itm.advice.notificationservice.exception.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        Info apiInfo = new Info()
                .title("Notification Service REST APIs")
                .description("APIs for notification-service. Данный сервис завязан вокруг уведомлений и служит для взаимодействия остальной части приложения.")
                .version("1.0.0");

        return new OpenAPI().info(apiInfo);
    }
}
