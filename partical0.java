import java.util.*;
public class partical0 {
    int a;
    int b;
    int c;
    partical0(int a1,int b1,int c1){
        a=a1;
        b=b1;
        c=c1;
        if(a>b){
            if(a>c)
            System.out.println("A is greatest :"+a);
            else
            System.out.println("C is greatest:"+c);
        }
        else
            if(b>c){
        System.out.println("B is greatest:"+b);
            }
            else{
             System.out.println("C is greatest:"+c);
            }
    }
    public static void main(String[] args) {
        int[] q=new int[3];
        System.out.println("Enter value of A B C:");
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<3;++i){
               q[i]=sc.nextInt();
            }
        }
        new partical0(q[0],q[1],q[2]);
    }
}
