package com.example.javatest4.exam1.service;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.javaBean.File;

import java.util.List;

public interface FileService {
    public List<Actor> Login(String first_name, String last_name);
    public List<File> findFile();
    public void deleteActor(Integer id);
    public void updateActor(Integer id,Actor actor);
    public void saveActor(Address address, Customer customer);
    public List<Actor> findId(Integer id);
}
