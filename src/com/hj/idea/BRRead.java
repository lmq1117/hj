package com.hj.idea;
import java.io.*;

public class BRRead {
    public static void main(String[] args)  throws IOException{
        char c;
        // 使用System。in 创建 BufferedReader对象
        BufferedReader br = new BufferedReader(
            new InputStreamReader(
                    System.in
            )
        );
        System.out.println("请输入字符，按'q'键退出");

        do {
            c = (char)br.read();
            System.out.println(c);

        } while (c != 'q');
    }
}
