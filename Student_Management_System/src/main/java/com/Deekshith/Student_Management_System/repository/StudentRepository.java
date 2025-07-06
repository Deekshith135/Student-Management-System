package com.Deekshith.Student_Management_System.repository;

import com.Deekshith.Student_Management_System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Long> {
}