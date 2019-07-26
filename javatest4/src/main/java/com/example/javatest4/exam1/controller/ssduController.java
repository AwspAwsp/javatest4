package com.example.javatest4.exam1.controller;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
@Controller
public class ssduController {
    @Autowired
    private FileService fileService;
    static int count=0;
    @RequestMapping(value = "/delete")
    public String hello(){
        Actor actor=new Actor();
        actor.setActor_id(1);
        fileService.deleteActor(actor);
        return "dbc";
    }
    @RequestMapping(value = "/update")
    public String hello2(){
        //根据id修改值,更新成功
        Actor actor=new Actor();
        actor.setActor_id(1);
        actor.setFirst_name("wsp");
        actor.setLast_name("tt");
        fileService.updateActor(actor);
        return "dbc";
    }
    @RequestMapping(value = "/save")
    public String hello3( ){
        List<Customer> itc=fileService.findAll();//获得表的大小
        System.out.println(itc.size());
        count=itc.size()+1;
        //传入数据
        Customer customer=new Customer();
         customer.setAddress_id(5);
         customer.setFirst_name("wsp");
         customer.setLast_name("wsp");
           Date date=null;
         customer.setLast_update(date);
         customer.setActive(1);
         customer.setCreate_date(date);
         customer.setEmail("sssss");
         customer.setStroe_id(1);
         customer.setCustomer_id(count);
        fileService.saveActor(customer);//插入
        return "dbc";
    }
}
