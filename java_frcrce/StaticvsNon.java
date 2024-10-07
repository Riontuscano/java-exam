class Example {
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }
}

public class StaticvsNon {
    public static void main(String[] args) {
        Example.staticMethod();

        // Creating an object to call the non-static method
        Example example = new Example();
        example.nonStaticMethod();
    }
}
