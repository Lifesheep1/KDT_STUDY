package com.jungmin;

import java.util.Scanner;

public class M_ConvertScoreToGradeWithPlusAndMinus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("당신의 점수를 입력해주세요 : ");
        int score = sc.nextInt();
        System.out.println();

        System.out.println(convertScoreToGradeWithPlusAndMinus(score));
    }

    public static String convertScoreToGradeWithPlusAndMinus(int score) {
        String result;
        //if 0미만 ,100초과 : x
        if(score<0 || score>100){
            result = "INVALID SCORE";
        }
        //if 100~90까지 A
        else if(score>=98){
            result = "A+";
        } else if (score>=93) {
            result = "A";
        } else if (score>=90) {
            result = "A-";
        } else if (score>=88) {
            result = "B+";
        } else if(score>=83){
            result = "B";
        } else if (score>=80) {
            result = "B-";
        }else if (score>=78) {
            result = "C+";
        } else if(score>=73){
            result = "C";
        } else if (score>=70) {
            result = "C-";
        } else if (score>=68) {
            result = "D+";
        } else if(score>=63){
            result = "D";
        } else if (score>=60) {
            result = "D-";
        } else {
            result = "F";
        }

        // TODO:

        return result;
    }
}
