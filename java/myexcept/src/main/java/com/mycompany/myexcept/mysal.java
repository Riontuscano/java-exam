package com.mycompany.myexcept;
import java.util.*;
public class mysal {
     public static void main(String[] args) throws Exception{
         Scanner sc=new Scanner(System.in);
         try{System.out.println("Enter name and salary");
         String name=sc.next();
         double salary=sc.nextDouble();
         if(salary<0)
             throw new Myexcept("Invalid");
         else
                 System.out.println("valid salary");
         }catch(Exception e)
         {
             System.out.println(e);
         }
         finally{System.out.println("Thank u");
         }
         
         }
         
         
     }
 
