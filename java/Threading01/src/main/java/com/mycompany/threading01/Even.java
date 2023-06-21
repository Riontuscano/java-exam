package com.mycompany.threading01;

public class Even extends Thread { 
    @Override
    public void run(){
    int i;
    for( i=1;i<=50;++i){
       
        System.out.println(i);
        try{
            if(i%3==0)
           Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread a"+e);
            }
    }
}
}