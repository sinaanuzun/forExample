package com.example.forExample.controller;

import com.example.forExample.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api")
public class Controllers {

    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        1L,
                        "Sinan",
                        "gmail",
                        LocalDate.of(1999, Month.FEBRUARY, 21)
                ),
                new Student(
                        2L,
                        "Kuzey",
                        "gmail",
                        LocalDate.of(1993, Month.FEBRUARY, 21)
                )
        );
    }

    @GetMapping("trial")
    public List<String> trial(){
        return List.of("Hello","World","Sinan");
    }

    @GetMapping("local")
    public String local(){
        return "Hello World.";
    }

}
