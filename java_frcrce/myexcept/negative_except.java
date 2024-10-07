import java.util.*;

class Negative extends Exception {
    Negative(String msg) {
        super(msg);
    }
}

public class negative_except{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            
            int value = sc.nextInt();

            if (value < 0) {
                throw new Negative("Number less than zero");
            } else {
                System.out.println("Valid input");
            }
            
        } catch (Negative e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
}
}
