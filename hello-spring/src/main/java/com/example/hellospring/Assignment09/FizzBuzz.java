package com.example.hellospring.Assignment09;

public class FizzBuzz implements IFizzBuzz  {
    @Override
    public String GetResult(int input){
        if(input <= 2){return String.valueOf(input);}
        else {
            String result = "";
            GetFizz gf = new GetFizz();
            result = gf.GetResult(input);

            GetBuzz gb = new GetBuzz();
            result += gb.GetResult(input);

            GetKBTG gkbtg = new GetKBTG();
            result += gkbtg.GetResult(input);

            if("".equals(result))
            {
                result = String.valueOf(input);
            }

            return  result;
        }
    }

}