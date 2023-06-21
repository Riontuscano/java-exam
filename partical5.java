
public class partical5 {
  
        public static void main(String[] args) {
          // create a string
          String str = "Hello World!";
          System.out.println(str);
          // get the length of the string
          int length = str.length();
          System.out.println("Length of the string: " + length);
          
          // get a substring
          String substring = str.substring(7);
          System.out.println("Substring: " + substring);
          
          // concatenate two strings
          String str2 = "Java";
          String concat = str.concat(str2);
          System.out.println("Concatenated string: " + concat);
          
          // convert the string to uppercase
          String uppercase = str.toUpperCase();
          System.out.println("Uppercase string: " + uppercase);
          String lowercase = str.toLowerCase();
          System.out.println("lowercase string: " + lowercase);
          
          // replace a character in the string
          String replaced = str.replace('o', 'a');
          System.out.println("Replaced string: " + replaced);
          
          // check if the string contains a specific character sequence
          boolean contains = str.contains("World");
          System.out.println("Contains 'World'? " + contains);
          
          // get the index of a specific character or sequence
          int index = str.indexOf('o');
          System.out.println("Index of 'o': " + index);
          }
        }
