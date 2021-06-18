package com.example.hellospring.Assignment09;

public class GetKBTG implements IFizzBuzz {
    @Override
    public String GetResult(int input) {
        String result = "";
        if (input % 7 == 0) {
            result = "KBTG";
        }
        return result;
    }
}
