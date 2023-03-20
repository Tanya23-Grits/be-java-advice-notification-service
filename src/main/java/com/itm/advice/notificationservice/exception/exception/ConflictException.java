package com.itm.advice.notificationservice.exception.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class ConflictException extends PlatformException {

    public ConflictException(String message) {
        super(message, HttpStatus.CONFLICT);
    }
}
