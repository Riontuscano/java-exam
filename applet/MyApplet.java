import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet
{
  public void init(){
  int h; 
  int w=20;
}
  public void paint(Graphics g)
{
   g.drawLine(10,0,10,500);
   g.drawLine(500,10,0,10);
}
}
//<Applet code="MyApplet" width=600 height=600></Applet>