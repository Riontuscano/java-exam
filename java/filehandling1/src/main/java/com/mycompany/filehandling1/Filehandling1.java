
package com.mycompany.filehandling1;
import java.io.*;
import java.util.Scanner;

public class Filehandling1 {

    public static void copycontent(File a,File b) throws Exception  {
        FileInputStream in=new  FileInputStream(a);
        FileOutputStream out=new FileOutputStream(b);
        int n;
       while((n=in.read())!=-1){
           out.write( (byte)n);
           System.out.print((char)n);
       }
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter source file");
        String a=sc.nextLine();
        File x= new File(a);
        System.out.println("Enter dest file");
        String b=sc.nextLine();
        File y=new File(b);
        copycontent(x,y);
    }
}
