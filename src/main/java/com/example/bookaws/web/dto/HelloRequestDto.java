package com.example.bookaws.web.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloRequestDto {

    private final String name;
    private final int amount;

}
