package com.hj.idea;

public class Hello {
    private String testChar = "test";
    private String testS = "testS";

    public String getTestChar(){
        return this.testChar;
    }

    public static void main(String[] args) {
        Hello h = new Hello();

        System.out.println(h.getTestChar());
        //类内部可以访问私有属性
        System.out.println(h.testS);
    }
}
