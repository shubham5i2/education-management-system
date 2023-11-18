package com.ems.controller;

import com.ems.dto.StudentRequest;
import com.ems.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> createProduct(@RequestBody StudentRequest studentRequest) {
        return studentService.registerStudent(studentRequest);
    }

    /*@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentResponse> getAllProducts() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public StudentResponse getStudentById(@PathVariable("id") UUID id) {
        return studentService.getStudentById(id);
    }*/
}
