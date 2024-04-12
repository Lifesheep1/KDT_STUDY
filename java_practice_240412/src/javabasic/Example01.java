package javabasic;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        int x = 1;
        double a = 20.0;
        char y = 'a';
        boolean qw = true;
        String name = "yang";//레퍼런스 타입

        int intVariable = 2100000000;
        intVariable = Integer.MAX_VALUE;
        intVariable = Integer.MIN_VALUE;

        double doubleVariable = 0.123456789012345;
        doubleVariable = Double.MAX_VALUE;

        char charVariable = 'a';
        char charVariable2 = 'A';

        boolean isTrue = false;

        String strVariable = "Spring";
        strVariable = new String("Java");
        strVariable.charAt(2);

        System.out.println(add(3,5));
        System.out.println(minus(3,5));
        System.out.println(multiply(3,5));
        System.out.println(devide(6,3));

    }
    static int add(int e, int r){
        return e + r;
    }
    static int minus(int e,int r){
        return e - r;
    }
    static int multiply(int e,int r){
        return e * r;
    }
    static int devide(int e, int r) {return e / r;}




}
