
package com.mycompany.study4;
 class demo {
     demo(){
         System.out.println("Object is created ");

     }
         protected void finalize(){
             System.out.println("Object is destroyed");
         }
     }
public class Study4{
    public static void main(String[] args) {
   demo S =new demo();
   S=null;//1st way is assigning a null
   demo S1=new demo();
   demo S2=new demo();
   S1=S2;//2nd way is to assigning reference to another
   
   new demo();//3rd by anonymous object
   System.gc();
    }
}
