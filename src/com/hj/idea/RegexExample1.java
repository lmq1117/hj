package com.hj.idea;

import java.util.regex.Pattern;

public class RegexExample1 {
    public static void main(String[] args) {
        String content = "I am nonb " + "from runo0ob.com.";
        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern,content);

        System.out.println("字符串中是否包含了 'runoob'子字符串？"+isMatch);

    }

    public static class TestIt {
        public static void main(String[] args) {
            int[] myArray = {1,2,3,4,5};
            ChangeIt.doIt(myArray);
            for(int j=0;j<myArray.length;j++){
                System.out.println(myArray[j] + " ");
            }
        }

        static class ChangeIt{
            static void doIt(int[] z){
                z = null;
            }
        }
    }
}
