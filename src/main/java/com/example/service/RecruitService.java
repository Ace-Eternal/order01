package com.example.service;

import com.example.dao.IInfoDao;
import com.example.entity.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recruit")
@CrossOrigin
public class RecruitService {
    @Autowired
    IInfoDao infoDao;
    @PostMapping("/submit")
    public Boolean submitInfo(@RequestBody Info info){
        Info info1=infoDao.findByPhone(info.getPhone());
        if(info==null||info1!=null){
            return false;
        }else{
            infoDao.save(info);
            return true;
        }
    }
}
