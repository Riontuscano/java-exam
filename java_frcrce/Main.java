class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Line {
    CIrclemain p1, p2;
    
    public Line(CIrclemain p1, CIrclemain p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    
    public double length() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
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
       
        CIrclemain p1 = new CIrclemain(0, 0);
        CIrclemain p2 = new CIrclemain(3, 0);
        CIrclemain p3 = new CIrclemain(3, 4);

     
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p3);
        Line l3 = new Line(p3, p1);

        Triangle triangle = new Triangle(l1, l2, l3);

        System.out.println("Perimeter: " + triangle.perimeter());

        Triangle.displayTriangleCount();
    }
}
