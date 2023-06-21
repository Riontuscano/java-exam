public class partical8 extends Overriding{
  
    public static void main(String[] args) {
        Overriding obj=new Overriding();
         A a =obj.new A();
         B b=obj.new B();
         a.meth2();
         b.meth2();
        System.out.println(a.rio());
        System.out.println("Hello World!");
    }
}

