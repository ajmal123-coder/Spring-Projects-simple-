package com.ajmal.product_management_system.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String message;
    private String details;
    private String errorCde;
    private Map<String, String> errors;

    public ErrorDetails(LocalDateTime timestamp, String message, String details, String errorCde) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.errorCde = errorCde;

    }
}
