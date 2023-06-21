import java.io.*;
public class count {
    public static void main(String[] args) throws Exception {
        String name ="abcd.txt";
       try (BufferedReader in = new BufferedReader(new FileReader(name))) {
        String line;
           int linecount=0;
           int wordcount=0;
           while((line=in.readLine())!=null){
                linecount++;
                String[] words=line.split("  ");
                wordcount=wordcount+words.length;
                }
           System.out.println(linecount);
           System.out.println(wordcount);
    }
}
}