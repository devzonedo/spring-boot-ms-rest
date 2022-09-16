package com.devz.user.service.service;

import com.devz.user.service.VO.Department;
import com.devz.user.service.VO.ResponseTemplateVO;
import com.devz.user.service.entity.SUser;
import com.devz.user.service.repository.SUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    public SUserRepository SUserRepository;

    @Autowired
    private RestTemplate restTemplate;

    public SUser saveUser(SUser SUser) {
        log.info("saveUser method of UserService");
        return SUserRepository.save(SUser);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        SUser sUser =  SUserRepository.findByUserId(userId);
        //call the departmentMicroService
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ sUser.getDepartmentId(), Department.class);
        vo.setSUser(sUser);
        vo.setDepartment(department);
        return vo;

    }
}
