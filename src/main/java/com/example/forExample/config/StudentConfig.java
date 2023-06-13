package com.example.forExample.config;

import com.example.forExample.entities.Student;
import com.example.forExample.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig implements CommandLineRunner {

    private final StudentRepository repository;

    public StudentConfig(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student sinan = new Student(
                "Sinan",
                "gmail",
                LocalDate.of(1999, Month.FEBRUARY, 21)
        );
        Student alex = new Student(
                "Alex",
                "gmail",
                LocalDate.of(1977, Month.FEBRUARY, 21)
        );
        Student emre = new Student(
                "Emre",
                "gmail",
                LocalDate.of(1980, Month.FEBRUARY, 21)
        );
        repository.saveAll(List.of(sinan, alex, emre));
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return this;
    }
}
