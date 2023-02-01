package com.example.bookaws.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloRequestDtoTest {

    @Test
    public void 롬복_기능_테스트() throws Exception {

        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloRequestDto dto = new HelloRequestDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        
    }
}