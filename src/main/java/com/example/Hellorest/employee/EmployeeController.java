package com.example.Hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")//ประกาศ Get
    public EmployeeResponse getEmployeeByID(@PathVariable String id){
        //validate id => Number Only
        int _id = 0;
       try {
           _id = Integer.parseInt(id);
       }
       catch(Exception e){

       }
        return new EmployeeResponse(_id,"Chakkapong","Chaowannasiri");
    }
}
