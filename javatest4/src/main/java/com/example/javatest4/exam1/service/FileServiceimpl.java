package com.example.javatest4.exam1.service;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.javaBean.File;
import com.example.javatest4.exam1.mapper.FileMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceimpl implements FileService {
@Autowired
      private FileMapper fileMapper;
    public List<Customer> findAll(){
        return fileMapper.findAll();
    }
    public  List<Actor> Login(Actor actor) {

        return fileMapper.Login(actor);
    }


    public List<File> findFile() {
        return fileMapper.findFile();
    }


    public void deleteActor(Actor actor) {
        fileMapper.deleteActor(actor);
          System.out.println(11);
    }


    public void updateActor(Actor actor) {
        fileMapper.updateActor(actor);
        System.out.println(11);
    }


    public void saveActor( Customer customer) {
        fileMapper.saveActor(customer);
        System.out.println(11);
    }
    public List<Actor> findId(Actor actor){
        return fileMapper.findId(actor);
    }
}
