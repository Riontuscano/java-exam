import java.util.*;
public class vector1 {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>(8,3);
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        System.out.println("Vector: ");
        System.out.println(v);
        v.add(1,70);
        System.out.println("Vector: ");
        System.out.println(v);
        v.remove(0);
        System.out.println("Vector: ");
        System.out.println(v);
        v.remove(3);
        System.out.println("Vector: ");
        System.out.println(v);
        

    }
}
