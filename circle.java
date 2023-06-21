import java.util.*;
public class circle {
    public double procdata(int r,double pi){ 
        double area;
        area=pi*r*r;
        return area;

    }
    public void display(double area)
    {
        System.out.println("Area of circle "+area);
    }
    public static void main(String[] args) {
        circle c=new circle();
        final double pi=3.14;
        int r;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter r");
            r=sc.nextInt();
        }
        double area=c.procdata(r,pi);
        c.display(area);

    }
}
