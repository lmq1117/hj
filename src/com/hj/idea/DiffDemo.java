package com.hj.idea;

import java.util.*;
public class DiffDemo {
    public static void main(String[] args) {
        try{
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");
//            System.out.println(new Date() + "\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println("Different is : " + diff);
        } catch (Exception e){
            System.out.println("吆，有个异常，快来看看");
        }

    }


}
