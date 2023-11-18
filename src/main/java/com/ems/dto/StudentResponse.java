package com.ems.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    private UUID studentUuid;

    private String studentName;

    private String email;

    private String phoneNumber;

    private String programOfStudy;

    private String birthDate;

    private String state;

    private String country;
}
