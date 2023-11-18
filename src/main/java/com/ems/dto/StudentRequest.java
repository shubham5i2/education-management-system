package com.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequest {

    private String studentName;

    private String email;

    private String phoneNumber;

    private String programOfStudy;

    private String birthDate;

    private String state;

    private String country;
}
