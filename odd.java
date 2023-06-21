public class odd implements Runnable {
    @Override
    public void run() {
        int i;
    for( i=1;i<=50;++i){
        try{if(i%2!=0)
        System.out.println("     "+i);
            if(i%3==0)
           Thread.sleep(500);
            }catch(Exception e){
                System.out.println("Thread d"+e);
            }
    }
    
}
   
}
