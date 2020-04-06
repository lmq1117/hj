package com.hj.idea;

public class TestVoidMethod {
    public static void main(String[] args){
        printGrade(78.5);

    }

    public static void printGrade(double score){
//        String grade = "";
        if(score >= 90.0){
            System.out.println('A');
        } else if (score >= 80){
            System.out.println('B');
        } else if (score >= 70.0) {
            System.out.println('C');
        } else if (score >= 60.0) {
            System.out.println('D');
        } else {
            System.out.println('E');
        }
    }

}
