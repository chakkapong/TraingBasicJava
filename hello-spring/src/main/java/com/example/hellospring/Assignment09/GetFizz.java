package com.example.hellospring.Assignment09;

public class GetFizz implements IFizzBuzz {
    @Override
    public String GetResult(int input){
        String result = "";
        if(input % 3 == 0){
            result = "Fizz";
        }
        return  result;
    }
}
