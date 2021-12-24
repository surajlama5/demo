package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Suraj",
                "surajmoktan40@gmail.com",
                26

        ));
    }
}
//dependency injection
