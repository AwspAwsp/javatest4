package com.example.javatest4.exam1.controller;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class ssduController {
    @Autowired
    private FileService fileService;
    @RequestMapping(value = "/delete")
    public String hello(Integer id){
        fileService.deleteActor(id);
        return "dbc";
    }
    @RequestMapping(value = "/update")
    public String hello2(Integer id){
        //根据id修改值
        Actor actor=new Actor();
        actor.setFirst_name("wsp");
        fileService.updateActor(id,actor);
        return "dbc";
    }
    @RequestMapping(value = "/save")
    public String hello3(Address address, Customer customer){
        //传入数据
        fileService.saveActor(address,customer);
        return "dbc";
    }
}
