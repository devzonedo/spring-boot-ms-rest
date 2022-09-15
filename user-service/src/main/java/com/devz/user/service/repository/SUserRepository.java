package com.devz.user.service.repository;

import com.devz.user.service.entity.SUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SUserRepository extends JpaRepository<SUser,Long> {

    SUser findByUserId(Long userId);

}
