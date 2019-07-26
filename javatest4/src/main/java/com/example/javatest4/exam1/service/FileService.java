package com.example.javatest4.exam1.service;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.javaBean.File;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileService {
    public  List<Actor> Login(Actor actor);
    public List<File> findFile();
    public void deleteActor(Actor actor);
    public void updateActor(Actor actor);
    public void saveActor( Customer customer);
    public List<Actor> findId(Actor actor);
    public List<Customer> findAll();
}
