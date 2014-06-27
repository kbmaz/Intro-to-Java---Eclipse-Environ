import java.awt.*;
import java.applet.Applet;


public class ReturnDemo extends Applet {
  
  int height = 60;
  int width = 42;
 
  
  public void paint(Graphics g) {
   g.drawRect(25, 25, width, height); 
   g.drawString("area of rectangle is " + areaRectangle(60,42), 20, 130);
   g.drawString("perimeter of rectangle is " + perimeterRectangle(60,42), 20, 150);
   g.drawString("rectangle center is (" + centerXRectangle(25,42)+"," + centerYRectangle(25,60)+")", 20, 170);
  }
 
  private int areaRectangle(int side1, int side2) {
    int area = side1 * side2;
    return area;
  }
  private int perimeterRectangle(int side1, int side2) {
    int perimeter = (side1 + side2)*2;
    return perimeter;
  }
  private int centerXRectangle (int x1, int x2){
    int centerX = (x1 + x2)/2;
    return centerX;
  }
  private int centerYRectangle (int y1, int y2) {
    int centerY = (y1 + y2)/2;
    return centerY;
    
  }
}
