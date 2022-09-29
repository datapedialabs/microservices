package com.kaankaplan.movieService.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailMessageKafkaDto {

    private String sender;
    private String recipient;
    private String subtitle;
    private String messageBody;
}