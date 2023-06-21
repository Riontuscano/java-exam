
package com.mycompany.study1;

public class Study1 {

    public static void main(String[] args) {
        int[] marks={10,20,30,40,50};
        System.out.println("length of Array;-");
        System.out.println(marks.length);
        System.out.println("Element of Array;-");
        for (int i = 0; i < marks.length; i++) 
            System.out.println(marks[i]);
        System.out.println("For each loop");
         for(int element:marks)
            System.out.println(element);
             
            
       
        
        
    }
}
