package com.vilin.chapter22.decorator.example5;

import java.io.*;

public class Client {
    public static void main(String[] args) {
        //流式输出文件
        DataOutputStream dout = null;
        try {
            dout = new DataOutputStream(
                    new EncryptOutputStream2(
                            new BufferedOutputStream(
                                    new FileOutputStream("MyEncrypt.txt"))));

            //然后就可以输出内容了
            dout.write("abcdxyz".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    dout = null;
                }
            }
        }


    }
}
