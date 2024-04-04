package com.jungmin;

public class G_FizzBuzz {
    public String fizzBuzz(int num) {
        // TODO:
        if (num % 15 == 0) {
            return "FizzBuzz";
        } else if(num % 3 == 0){
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return "No FizzBuzz";
        }
    }
}
