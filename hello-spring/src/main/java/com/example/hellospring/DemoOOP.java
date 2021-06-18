package com.example.hellospring;

public class DemoOOP {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        if(emp1.equals(emp2)) {
            System.out.println("Equals");
        }
        else {
            System.out.println("Not Equals");
        }
    }
}
