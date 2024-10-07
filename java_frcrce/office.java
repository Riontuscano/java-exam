import java.util.Scanner;

interface admin{
    public static final String experience = "5 years";
    
}

class Person{
    String name;
    String code;

    public Person(String name, String code){
        this.name = name;
        this.code = code;
    }

}


class Account extends Person{
    double pay;

    public Account(String name, String code, double pay){
        super(name, code);
        this.pay = pay;
    }
}




class Master extends Account implements admin{
    
    public Master(String name, String code, double pay) {
        super(name, code, pay);
        
      
    }

    public void display(){
        System.out.println("\nMaster name : " + name);
        System.out.println("Master code : " + code);
        System.out.println("Master pay : " + pay);
        System.out.println("Required expirence : " + experience);
    }

    public void update(Scanner sc){
        System.out.print("\nEnter Master name : ");
        name = sc.nextLine();
        System.out.print("\nEnter Master code : ");
        code = sc.nextLine();
        System.out.print("\nEnter Master pay : ");
        pay = sc.nextDouble();
    }


}
public class office{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Master m = new Master("Rahul", "C++", 1500); 

        System.out.print("\nDemo Account details:");
        m.display();
        m.update(sc);
        m.display();


    }
    
}
