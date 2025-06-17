package com.Spring.Student.Internship.Portal.Model.Dtos.InternDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class InternResDto {
    private String internName;
    private Integer capacity ;
    private LocalDateTime createAt;
    private Integer period;
}
