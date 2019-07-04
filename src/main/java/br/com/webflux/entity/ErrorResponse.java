package br.com.webflux.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ErrorResponse {
    private Date timestamp;
    private Integer status;
    private String error;
    private String message;
}
