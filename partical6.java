import java.util.Vector;
public class partical6 {
  public static void main(String[] args) {
    // create a new vector
    Vector<Integer> vector = new Vector<Integer>();
    
    // add elements to the vector
    vector.add(10);
    vector.add(20);
    vector.add(30);
    vector.add(40);
    vector.addElement(50);
   
    
    // print the vector
    System.out.println("Vector: " + vector);
    
    // get the size of the vector
    int size = vector.size();
    System.out.println("Size of the vector: " + size);
    
    // access an element at a specific index
    int element = vector.get(2);
    System.out.println("Element at index 2: " + element);
    
    // set an element at a specific index
    vector.set(3, 50);
    System.out.println("Vector after setting element at index 3: " + vector);
    
    // remove an element at a specific index
    vector.remove(1);
    System.out.println("Vector after removing element at index 1: " + vector);
    
    // check if the vector contains a specific element
    boolean contains = vector.contains(30);
    System.out.println("Vector contains 30? " + contains);

    // find the index of a specific element
    int index = vector.indexOf(40);
    System.out.println("Index of 40: " + index);
    // insert number at specific location
    vector.insertElementAt(90, 2);
    System.out.println("After insertion"+vector);
    // clear the vector
    vector.clear();
    System.out.println("Vector after clearing: " + vector);
  }
}
