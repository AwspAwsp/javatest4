package com.example.javatest4.exam1.mapper;

import com.example.javatest4.exam1.javaBean.Actor;
import com.example.javatest4.exam1.javaBean.Address;
import com.example.javatest4.exam1.javaBean.Customer;
import com.example.javatest4.exam1.javaBean.File;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface FileMapper {
    public List<Actor> Login(String first_name, String last_name);
    public List<File> findFile();
    public void deleteActor(String id);
    public void updateActor(String id,Actor actor);
    public void saveActor(Address address, Customer customer);
    public List<Actor> findId(Integer id);
}
