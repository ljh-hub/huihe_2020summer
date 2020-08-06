package com.huihe.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

//@Component
public class User {

//    @Value("hxj")
//    private String username;
//
//    @Autowired
//    private Dog dog;
    String[] foods;
    List<String> hobbies;
    Set<String> plays;
    Map<String, String> plans;
    Properties config;

    public void setFoods(String[] foods) {
        this.foods = foods;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setPlays(Set<String> plays) {
        this.plays = plays;
    }

    public void setPlans(Map<String, String> plans) {
        this.plans = plans;
    }

    public void setConfig(Properties config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return "User{" +
                "hobbies=" + hobbies +
                ", plays=" + plays +
                ", foods=" + Arrays.toString(foods) +
                ", plans=" + plans +
                ", config=" + config +
                '}';
    }
}
