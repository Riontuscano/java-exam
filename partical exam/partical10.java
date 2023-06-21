import com.mypackage.*;

public class partical10 {
  public static void main(String[] args) {
    MyClass obj = new MyClass(); // import from com.example.mypackage
    Hello obj1=new Hello();//import from com.example.mypackage
    Calculate c=new Calculate();
    obj.displayMsg();
    obj1.printMsg();
    c.Cal(7);
  }
}


