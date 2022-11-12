package com.example.dao;

import com.example.entity.Info;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInfoDao extends JpaRepository<Info,String> {
    Info findByPhone(String phone);
}
