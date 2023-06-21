public class Overriding {
    class A{
        public int rio(){
            return 1248;
        }
        public void meth2(){
            System.out.println("This is method 2 of class A");
        }
        }
    class B extends A
    {
        @Override
        public void meth2(){
            System.out.println("This is method 2 of class B");
        }
         public void meth3(){
            System.out.println("This is method 3 of class B");
        }
        
    }
}




    