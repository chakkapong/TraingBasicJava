package com.example.Hellorest.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/{id}")//ประกาศ Get
    public EmployeeResponse getEmployeeByID(int id){
        return new EmployeeResponse(id,"Chakkapong","Chaowannasiri");
    }
}
