package com.ems.service;

import com.ems.dto.StudentRequest;
import com.ems.entity.Student;
import com.ems.repository.StudentRepository;
import com.ems.response.ResponseHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public ResponseEntity<Object> registerStudent(StudentRequest studentRequest) {
        Student student = Student.builder()
                .studentName(studentRequest.getStudentName())
                .email(studentRequest.getEmail())
                .phoneNumber(studentRequest.getPhoneNumber())
                .programOfStudy(studentRequest.getProgramOfStudy())
                .birthDate(studentRequest.getBirthDate())
                .state(studentRequest.getState())
                .country(studentRequest.getCountry())
                .build();
        studentRepository.save(student);
        log.info("Student {} is saved", student.getStudentUuid());
        return ResponseHandler.generateResponse(
                String.format("Student with id %s is saved successfully", student.getStudentUuid()),
                HttpStatus.CREATED,
                student);
    }

    /*@Override
    public List<StudentResponse> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(this::mapToStudentResponse).toList();
    }*/

    /*@Override
    public StudentResponse getStudentById(UUID studentUuid) {
        Optional<Student> studentOptional = studentRepository.findById(studentUuid);
        if (studentOptional.isEmpty()) {
            throw new StudentNotFoundException(String.format("Student %s is not present", studentUuid));
        }
        return mapToStudentResponse(studentOptional.get());
    }*/

    /*private StudentResponse mapToStudentResponse(Student student) {
        return StudentResponse.builder()
                .studentUuid(student.getStudentUuid())
                .studentName(student.getStudentName())
                .email(student.getEmail())
                .phoneNumber(student.getPhoneNumber())
                .programOfStudy(student.getProgramOfStudy())
                .birthDate(student.getBirthDate())
                .state(student.getState())
                .country(student.getCountry())
                .build();
    }*/
}
