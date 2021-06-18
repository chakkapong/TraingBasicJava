package com.example.hellospring.Assignment09;

public class GetBuzz implements IFizzBuzz {
    @Override
    public String GetResult(int input) {
        String result = "";
        if (input % 5 == 0) {
            result = "Buzz";
        }
        return result;
    }
}
