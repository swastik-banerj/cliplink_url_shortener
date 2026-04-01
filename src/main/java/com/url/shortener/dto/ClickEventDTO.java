package com.url.shortener.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClickEventDTO {
    private Long clickCount;
    private LocalDate clickDate;
}

