import java.util.Scanner;

class Publication{
    String Title;
    float Price;

    public void getData(Scanner sc){
        System.out.println("Enter Title:");
        Title = sc.nextLine();
        System.out.println("Enter Price:");
        Price = sc.nextFloat();

    }
    public void displayData(){
        System.out.println("Title:"+Title);
        System.out.println("Price:"+Price);
    }
} 

class Book extends Publication{
    int pages;
    public void getData(Scanner sc){
        super.getData(sc);
        System.out.println("Enter no. of Pages:");
        pages = sc.nextInt();
    }
    public void displayData(){
        super.displayData();
        System.out.println("Numbers of pages:"+pages);
    }
}

class Tape extends Publication{
    float time;
    public void getData(Scanner sc){
        super.getData(sc);
        System.out.println("Enter playing time in min:");
        time = sc.nextFloat();
    }
    public void displayData(){
        super.displayData();
        System.out.println("Time:"+time);
    }
}

/**
 * Stores
 */
public class Stores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book bk = new Book();
        Tape tp = new Tape();
        System.out.println("Enter Details of Book:");
        bk.getData(sc);
        System.out.println("Details of Book:");
        bk.displayData();
        System.out.println("Enter Details of Tape:");
        tp.getData(sc);
        System.out.println("Details of Tape:");
        tp.displayData();
     
     sc.close();
    }
}