package com.example.Topic.Manor.Services;

import com.example.Topic.Manor.Entitys.Userr;
import com.example.Topic.Manor.Repos.Repo_One;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceV1 {
    private final Repo_One rpo;

    public ServiceV1(Repo_One rpo) {
        this.rpo = rpo;
    }

    public List<Userr> gettAllTopics() {
        return rpo.findAll();
    }

    public  Userr addTopic(Userr usr) {

        return rpo.save(usr);
    }

    public void deleteTopic(Long id) {
         rpo.deleteById(id);
    }

    public Userr getTopicById(Long id) {
        return rpo.findById(id).orElseThrow();
    }
}
