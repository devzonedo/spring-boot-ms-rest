package com.devz.department.service.service;

import com.devz.department.service.entity.Student;
import com.devz.department.service.repository.DepartmentRepository;
import com.devz.department.service.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
