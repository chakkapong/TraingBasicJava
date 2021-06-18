package com.example.hellospring.Assignment08;

public class FizzBuzz implements IFizzBuzz {
    @Override
    public String GetResult(int input){
        if(input <= 2){return String.valueOf(input);}
        else {
            String result = "";
            int check = input;

                if(check % 3 == 0 && check % 5 == 0){
                    result = "FizzBuzz";
                }else if(check % 3 == 0){
                    result = "Fizz";
                }
                else if(check % 5 == 0){
                    result = "Buzz";
                }
                else{
                    result = String.valueOf(input);;
                }
            return  result;
        }
    }

}
