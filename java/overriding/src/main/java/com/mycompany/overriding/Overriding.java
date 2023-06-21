
package com.mycompany.overriding;

class A {
    public int a;
    public int rio(){
        return 1248;
    }
    public void meth2(){
        System.out.println("This is method 2 of class A");
    }
    }
class B extends A
{
    @Override
    public void meth2(){
        System.out.println("This is method 2 of class B");
    }
     public void meth3(){
        System.out.println("This is method 3 of class B");
    }
    
}
public class Overriding{
    public static void main(String[] args) {
         B b=new B();
         A a=new A();
         a.meth2();
         b.meth2();
        System.out.println("Hello World!");
    }
}

