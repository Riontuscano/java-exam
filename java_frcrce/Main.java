class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   public void displayPoint(){
    System.out.println("Point is at (" + x + "," + y + ")");
   }
}

class Line{
    Point p1, p2;
    
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    
    public double length() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }

    public void displayLine(){
        System.out.println("Line is from (" + p1.x + "," + p1.y +")"+"("+p2.x+","+p2.y+")");
        System.out.println("Length is " + length());

    }
}


class Triangle {
    Line l1, l2, l3;
    static int triangleCount = 0;  

   
    public Triangle(Line l1, Line l2, Line l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        triangleCount++;
    }

    
    public double perimeter() {
        return l1.length() + l2.length() + l3.length();
    }

    
    public static void displayTriangleCount() {
        System.out.println("Triangles created: " + triangleCount);
    }
}


public class Main {
    public static void main(String[] args) {
       
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 0);
        Point p3 = new Point(5, 7);

     
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p3);
        Line l3 = new Line(p3, p1);

        Triangle triangle = new Triangle(l1, l2, l3);

        p1.displayPoint();
        p2.displayPoint();
        p3.displayPoint();
        l1.displayLine();
        l2.displayLine();
        l3.displayLine();

        System.out.println("Perimeter: " + triangle.perimeter());
        
        Triangle.displayTriangleCount();
    }
}
