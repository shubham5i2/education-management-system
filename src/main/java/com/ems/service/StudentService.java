package com.ems.service;

import com.ems.dto.StudentRequest;
import org.springframework.http.ResponseEntity;

public interface StudentService {

    ResponseEntity<Object> registerStudent(StudentRequest studentRequest);

//    List<StudentResponse> getAllStudents();

//    StudentResponse getStudentById(UUID studentUuid);
}
