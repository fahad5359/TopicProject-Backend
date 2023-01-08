package com.example.Topic.Manor.Entitys;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "User_Data")
public class Userr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String user_name;

    @NotBlank(message = "Please Add A Topic")
//    @Size(min = 2, message = "Too Short")
//    @Size(max = 200, message = "Too long")
    private String topicc;

    @NotBlank(message = "Please Add A Message")
    private String messsage;


    private String immge;

    // ------------------------------------- Constructor
    public Userr(Long id, String user_name, String topicc, String messsage, String immge) {
        this.id = id;
        this.user_name = user_name;
        this.topicc = topicc;
        this.messsage = messsage;
        this.immge = immge;
    }

    public Userr() {

    }

    // ------------------------------------- Getters & Setters, & Tostring
    public Long getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getTopicc() {
        return topicc;
    }

    public String getMesssage() {
        return messsage;
    }

    public String getImmge() {
        return immge;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setTopicc(String topicc) {
        this.topicc = topicc;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }

    public void setImmge(String immge) {
        this.immge = immge;
    }

    @Override
    public String toString() {
        return "Userr{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", topicc='" + topicc + '\'' +
                ", messsage='" + messsage + '\'' +
                ", immge='" + immge + '\'' +
                '}';
    }
}
