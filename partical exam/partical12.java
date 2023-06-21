import java.util.*;
public class partical12 {
    public static void main(String[] args) throws Exception{
        try (Scanner sc = new Scanner(System.in)) {
            try{System.out.println("Enter name and salary");
            String name=sc.next();
            double salary=sc.nextDouble();
    
            if(salary<0)
                throw new Exception("Invalid input");
            else
                System.out.println("Name of the employee:"+name);
                    System.out.println("Valid salary of rs:"+salary);
            }catch(Exception e)
            {
                System.out.println(e);
            }
            finally{System.out.println("Thank u");
            }
        }
        
        }
}
