package com.example.javatest4.exam1.controller;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.service.FileService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class loginController {
    @Autowired
    private FileService fileService;
    @RequestMapping(value = "/login")
    public String hello( String first_name, String last_name){
       List<Actor> list =fileService.Login(first_name,last_name);//查到返回，存入集合，大于1
        if(list.size()>0)
            return "login";
        else
        {
            return "error";
        }
    }
}
