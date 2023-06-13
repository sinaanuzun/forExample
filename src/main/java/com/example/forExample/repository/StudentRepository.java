package com.example.forExample.repository;

import com.example.forExample.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("SELECT u FROM Student u WHERE u.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
