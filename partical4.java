import java.util.*;
public class partical4 {
    public void Sample(){
                System.out.println("I am a method");
    }
    public partical4(int a,int b){
        int i,j,sum;
        i=a;
        j=b;
        sum=i+j;
        System.out.println("Sum="+sum);
    }

    public partical4(){
        System.out.println("Hello");
        System.out.println("I am a construtor");
    }
    public static void main(String[] args) {
        partical4 obj1=new partical4();
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            partical4 obj2=new partical4(a,b);
            obj2.Sample();
            obj1.Sample();
        }
        

    }
}
