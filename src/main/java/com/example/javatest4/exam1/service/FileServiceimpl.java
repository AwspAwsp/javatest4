package com.example.javatest4.exam1.service;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.javaBean.File;
import com.example.javatest4.exam1.mapper.FileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceimpl implements FileService {
@Autowired
      private FileMapper fileMapper;

    public List<Actor> Login(String first_name, String last_name) {

        return fileMapper.Login(first_name,last_name);
    }


    public List<File> findFile() {
        return fileMapper.findFile();
    }


    public void deleteActor(Integer id) {
          System.out.println(11);
    }


    public void updateActor(Integer id,Actor actor) {
        System.out.println(11);
    }


    public void saveActor(Address address, Customer customer) {
        System.out.println(11);
    }
    public List<Actor> findId(Integer id){
        return fileMapper.findId(id);
    }
}
