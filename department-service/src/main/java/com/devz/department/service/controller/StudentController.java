package com.devz.department.service.controller;

import com.devz.department.service.entity.Student;
import com.devz.department.service.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;
    private StudentService studentServe;

    @PostMapping("/")
    public Student saveStudent(@RequestBody  Student student){
        log.info("method saveStudent of StudentController modified reload 4");
        log.info(student.toString());
        return this.studentService.saveStudent(student);
    }







}
