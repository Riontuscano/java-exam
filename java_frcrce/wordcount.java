import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: "); 
        String str = sc.nextLine();
        int count = countWords(str);
        System.out.println("Word count: " + count);
        sc.close();

    }
    public static int countWords(String str){
        str = str.trim();
        if(str.isEmpty() || str == " "){
            System.out.println("Empty String");
            return 0;
        }
        String[] words = str.split(" ");
        return words.length;
    }
}
