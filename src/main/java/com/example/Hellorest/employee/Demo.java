package com.example.Hellorest.employee;


import org.springframework.stereotype.Component; 


@Component 
public class Demo { 
    private String name; 


    public String getName() { 
         return name; 
     } 
 

     public void setName(String name) { 
         this.name = name; 
     } 
 } 