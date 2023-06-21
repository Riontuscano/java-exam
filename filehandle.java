import java.io.*;
import java.util.*;
public class filehandle {
    public static void main(String[] args) throws IOException {
        int i;
        System.out.println("Enter content of file");
        try (Scanner sc = new Scanner(System.in)) {
            try (FileReader in = new FileReader("abcd.txt")) {
                FileWriter out = new FileWriter("abc.text",true);
                   i=in.read();
                    while(i!=-1){
                     i=in.read();
                     out.write(i);   
                    }
                     out.close();
            } 
            }
        }
        
    }

