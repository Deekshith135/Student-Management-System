package com.Deekshith.Student_Management_System.service;
import com.Deekshith.Student_Management_System.model.Student;
import com.Deekshith.Student_Management_System.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Student save(Student student) {
        return repo.save(student);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
