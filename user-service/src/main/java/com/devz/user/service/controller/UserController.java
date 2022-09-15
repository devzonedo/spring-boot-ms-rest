package com.devz.user.service.controller;

import com.devz.user.service.VO.ResponseTemplateVO;
import com.devz.user.service.entity.SUser;
import com.devz.user.service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/")
    public SUser saveUser(@RequestBody SUser suer){
        log.info("saveUser method of UserController");
        return  userService.saveUser(suer);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("getUserWithDepartment method of UserController");
        return userService.getUserWithDepartment(userId);
    }

}
