package dev.rohit.mysqlconnectiondemo.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class ExceptionDto {
    private LocalDateTime timestamp;
    private String error;
    private String message;
    private String path;
    private String code;
    private String trace;
}
