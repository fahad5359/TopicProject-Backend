package com.example.Topic.Manor.Controllers;


import com.example.Topic.Manor.Entitys.Userr;
import com.example.Topic.Manor.Services.ServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "vr1/user")
public class ContrllrV1 {
    @Autowired
    private final ServiceV1 srevce;

    public ContrllrV1(ServiceV1 srevce){
        this.srevce=srevce;
    }

    // ---------------------------------------- Rest Methods

    // ------------------------------------- Get
    @GetMapping(path="/Viow_All_Topics")
    public List<Userr> gettAll(){
        return srevce.gettAllTopics();
    }

    @GetMapping(path = "Viow_Topic/{id}")
    public Userr getTopicById(@PathVariable("id") Long id){
       return srevce.getTopicById(id);
    }

    // ------------------------------------- Post
    @PostMapping(path = "Post_Topic")
    void addTopic(@RequestBody Userr usr){
        System.out.println("Topic Sent !"+usr);
        srevce.addTopic(usr);
    }

    // ------------------------------------- Delete
    @DeleteMapping(path = "Delet_Topic/{id}")
    void deletTopic(@PathVariable("id") Long id){
        srevce.deleteTopic(id);
        System.out.println("user deleted"+id);
    }

    // ------------------------------------- Put
    @PutMapping(path = "Update_User")
    void updateTopic(@RequestBody Userr usr){
        System.out.println("user updated");
    }
}
