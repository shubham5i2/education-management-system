package com.ems.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "student_details")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID studentUuid;

    private String studentName;

    @Email(message = "Please enter a valid email")
    private String email;

    private String phoneNumber;

    private String programOfStudy;

    private String birthDate;

    private String state;

    private String country;
}
