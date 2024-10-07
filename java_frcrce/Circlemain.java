class Pointcenter{
    int x,y;

    public Pointcenter(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Circle{
    double radius;
    Pointcenter center;

    public Circle(Pointcenter center,double rad){
        this.radius = rad;
        this.center = center;
    }

    public void translate(int x,int y){
        center.x+=x;
        center.y+=y;
    }

    public void displaycenter(){
         System.out.println("Center of circle is at ("+center.x+","+center.y+")");
    }
} 

public class Circlemain{
    public static void main(String[] args) {
        Pointcenter center = new Pointcenter(5, 6);
        Circle cir = new Circle(center, 6);
        
         System.out.println("Inital center of circle:");
        cir.displaycenter();
        cir.translate(5,5);
         System.out.println("Center of circle and translating:");
        cir.displaycenter();

    }
}
