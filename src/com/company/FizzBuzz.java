package com.company;

import java.util.ArrayList;

public class FizzBuzz {
    public static String check(int a) {
        String[] list = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (a < 10 && a > 0) {
            if (a % 3 == 0) return "Fizz";
            if (a % 5 == 0) return "Buzz";
            return list[(a % 10) - 1];
        }else if (a<100){
            if (a/10 ==1){
                if (a%3==0)return "Fizz";
                if (a%5==0||a/10==5)return "Buzz";
                if (a%3==0&&a%5==0)return "FizzBuzz";
                return "mười" + list[(a%10)-1];
            }else if (a/10==3){
                if (a%10==5)return "Special";
                if (a%10==0)return "FizzBuzz";
                return "Fizz";
            }else if (a/10==5){
                if (a%10==3)return "Special";
                return "Buzz";
            }else {
            if (a%3 ==0) return "Fizz";
            if (a%5==0) return "Buzz";
            if (a%3==0&&a%5==0)return "FizzBuzz";
            return list[(a/10)-1] + " mươi " + list[(a%10)-1];
            }
        }
        return "Can not run";
    }
}
