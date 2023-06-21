import java.io.FileReader;

public class file2 {
    public static void main(String[] args) throws Exception {
        String name="abcd.txt";
         FileReader in=new FileReader(name);
         int i=0;
         int count=0;
         try{
            while(i!=-1){
            i=in.read();
            if(i==(char)' '){
                ++count;
            }
        }  
            System.out.println(count);

         }finally{
            if(in!=null)
            in.close();
         }
    }
}
