import java.util.Scanner;

class myExcept extends Exception {
    myExcept(String msg) {
        super(msg);
    }
}

public class firstn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a natural number:");
            int num = sc.nextInt();
            if (num < 1) {
                throw new myExcept("^\n|\n|\n|\n|\n|\nLook what is the prompt!!");
            }
            System.out.println("*********************************************");
            for (int i = 1; i <= num; ++i) {
                System.out.println(i);
            }
        } catch (myExcept e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("Enter a natural Number idiot Fuck!!");
            sc.close();
        }
    }
}
