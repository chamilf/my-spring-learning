package com.chf.spring.controller;

import com.chf.spring.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Chamil"),
            new Student(2, "Shammi")
    );

    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        return STUDENTS.stream()
                .filter(s -> s.getId() == studentId)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student " + studentId + " does not exists."));
    }
}
