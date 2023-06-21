

package com.mycompany.thissuper;

public class class1 {
    int a;
    public int getA(){
        return a;
    }
      class1(int a){
        this.a=a;
    }
}
    
class class2 extends class1{
    class2(int c){
        super(c);
        System.out.println("Mai ek constrcutor hoon");
    }
      public int getC(){
        return a;
      }
    public static void main(String[] args) {
        class1 T=new class1(10);
        class2 S=new class2(10);
        System.out.println(T.getA());
        System.out.println(S.getC());
        
        System.out.println("Using This ");
    }
}