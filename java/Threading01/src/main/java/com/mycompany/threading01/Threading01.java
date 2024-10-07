package com.mycompany.threading01;

public class Threading01 {

    public static void main(String[] args) {
        Even a= new Even();
        Odd b= new Odd();
        Thread t1=new Thread (b);
        System.out.println("Hello World!");
        a.setPriority(1);
        a.start();
        t1.start();
        
    }
}
