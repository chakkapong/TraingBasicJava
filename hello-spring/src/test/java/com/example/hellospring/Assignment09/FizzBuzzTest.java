package com.example.hellospring.Assignment09;

import com.example.hellospring.Assignment09.FizzBuzz;
import com.example.hellospring.Assignment09.IFizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void case1() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(1);
        assertEquals("1", case01);
    }
    @Test
    public void case2() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(2);
        assertEquals("2", case01);
    }
    @Test
    public void case3() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(3);
        assertEquals("Fizz", case01);
    }
    @Test
    public void case4() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(4);
        assertEquals("4", case01);
    }
    @Test
    public void case5() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(5);
        assertEquals("Buzz", case01);
    }
    @Test
    public void case6() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(6);
        assertEquals("Fizz", case01);
    }
    @Test
    public void case7() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(7);
        assertEquals("KBTG", case01);
    }
    @Test
    public void case8() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(8);
        assertEquals("8", case01);
    }
    @Test
    public void case9() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(9);
        assertEquals("Fizz", case01);
    }
    @Test
    public void case10() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(10);
        assertEquals("Buzz", case01);
    }
    @Test
    public void case11() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(11);
        assertEquals("11", case01);
    }
    @Test
    public void case12() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(12);
        assertEquals("Fizz", case01);
    }
    @Test
    public void case13() {
        com.example.hellospring.Assignment09.IFizzBuzz ifizz = new com.example.hellospring.Assignment09.FizzBuzz();
        String case01 = ifizz.GetResult(15);
        assertEquals("FizzBuzz", case01);
    }
    @Test
    public void case14() {
        IFizzBuzz ifizz = new FizzBuzz();
        String case01 = ifizz.GetResult(30);
        assertEquals("FizzBuzz", case01);
    }

}