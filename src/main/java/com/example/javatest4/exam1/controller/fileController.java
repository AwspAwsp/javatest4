package com.example.javatest4.exam1.controller;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.File;
import com.example.javatest4.exam1.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class fileController {
    @Autowired
    private FileService fileService;
    @RequestMapping(value = "/findfile")
    public String hello(Model model){
       List<File> list= fileService.findFile();
       model.addAttribute(list);//存到对象域，前端可以获取
        return "file";
    }
}
