class methodcount{
   public static int counter = 0;

   public void Hello(){
    System.out.println("Hello World");
    counter++;
   }
   public int getcounter(){
    return counter;
   }
}

public class methodcounter {
    public static void main(String[] args) {
        methodcount m1 = new methodcount();
    
        m1.Hello();
        m1.Hello();
        m1.Hello();
        System.out.println(m1.getcounter()); 
    }
}
