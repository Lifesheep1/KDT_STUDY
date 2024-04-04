package com.jungmin;

public class L_ConvertScoreToGrade {
    public char convertScoreToGrade(int score) {
        // TODO:
        if(score<0 || score>100){
            return 'X';
        }
        //if 100~90까지 A
        else if(score>=90){
            return 'A';
        }
        //else if89~80까지 B
        else if(score>=80){
            return 'B';
        }
        //else if79~70까지 C
        else if(score>=70){
            return 'C';
        }
        //else if69~60까지 D
        else if(score>=60){
            return 'D';
        }
        //else if59~0까지 F
        else {
            return 'F';
        }
    }
}
