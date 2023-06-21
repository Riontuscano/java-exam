import java.util.*;
public class partical1 {
    int a,b;
    public static void main(String[] args)
    { 
        int largest;
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
      largest= ( a > b ) ? a : b ;
        }
        System.out.println(largest);
    }
}
