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
    @RequestMapping(value = "/login")//登录
    public String hello(){
//        System.out.println(1);
        Actor actor=new Actor();
        actor.setFirst_name("DAN");//模拟数据
        actor.setLast_name("TORN");
       List<Actor> list =fileService.Login(actor);//查到返回，存入集合，大于1
        System.out.println(list.size());
        if(list.size()>0)
            return "login";
        else
        {
            return "error";
        }
    }
    @RequestMapping(value = "/h")
    public String hello1(){

            return "main";
    }
    @RequestMapping(value = "/hh")
    public String hello12(){
//      List<Actor> list=fileService.findAll();
//      System.out.println(list.size());
        return "main";
    }
}
