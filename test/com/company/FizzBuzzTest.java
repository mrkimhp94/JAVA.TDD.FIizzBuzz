package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
@Test
    void FizzBuzzTest1(){
    int a =26;
    String expected = "hai mươi sáu";
    String result = FizzBuzz.check(26);
    assertEquals(expected,result);
}
    @Test
    void FizzBuzzTest2(){
        int a =25;
        String expected = "Buzz";
        String result = FizzBuzz.check(25);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTest3(){
        int a =30;
        String expected = "FizzBuzz";
        String result = FizzBuzz.check(30);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTest4(){
        int a =24;
        String expected = "Fizz";
        String result = FizzBuzz.check(24);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTest5(){
        int a =31;
        String expected = "Fizz";
        String result = FizzBuzz.check(31);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTest6(){
        int a =56;
        String expected = "Buzz";
        String result = FizzBuzz.check(56);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTest7(){
        int a =53;
        String expected = "Special";
        String result = FizzBuzz.check(53);
        assertEquals(expected,result);
    }
    @Test
    void FizzBuzzTest8(){
        int a =120;
        String expected = "Can not run";
        String result = FizzBuzz.check(120);
        assertEquals(expected,result);
    }
}