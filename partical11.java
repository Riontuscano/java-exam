public class partical11 {
    public static void main(String[] args) {
        even a= new even();
        odd b= new odd();
        Thread t1=new Thread (b);
        System.out.println("Hello World!");
        a.setPriority(10);
        a.start();
        t1.start();
    }
}
