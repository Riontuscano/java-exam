public class partical7 {
        public static void main(String[] args) {
          // convert int primitive to Integer object
          int num1 = 10;
          Integer obj1 = Integer.valueOf(num1);
          System.out.println("Integer object from int primitive: " + obj1);
          
          // convert double primitive to Double object
          double num2 = 3.14;
          Double obj2 = Double.valueOf(num2);
          System.out.println("Double object from double primitive: " + obj2);
          
          // convert Integer object to int primitive
          Integer obj3 = Integer.valueOf(20);
          int num3 = obj3.intValue();
          System.out.println("int primitive from Integer object: " + num3);
          
          // convert Double object to double primitive
          Double obj4 = Double.valueOf(2.71);
          double num4 = obj4.doubleValue();
          System.out.println("double primitive from Double object: " + num4);
        }
      }
      

