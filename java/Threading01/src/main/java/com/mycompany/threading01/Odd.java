
package com.mycompany.threading01;

public class Odd implements Runnable  {
     @Override
    public void run(){
    int i;
    for( i=50;i>=1;--i){
        System.out.println("     "+i);
        try{
            if(i%3==0)
           Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Thread d"+e);
            }
}
}
}
