package com.devz.department.service.controller;
import org.springframework.web.bind.annotation.RestController;
import com.devz.department.service.entity.Department;
import com.devz.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/healthcheck")
    public String healthcheck(){
        return "v1.0";
    }


    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department department){
        log.info("inside saveDepartment method of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }







}
