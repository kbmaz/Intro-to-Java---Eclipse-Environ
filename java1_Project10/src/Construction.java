import java.awt.Graphics;
import java.applet.Applet;

/* Build 3 house shapes, using only 3 calls to a method named drawHouse. */

public class Construction extends Applet {

  public void paint(Graphics g) {
    drawHouse(g, 0, 50, 50, 30);
    drawHouse(g, 50, 100, 50, 30);
    drawHouse(g, 100, 150, 50, 30);
  }
  
  public void drawHouse(Graphics g, int bottomX, int bottomY, int width, int height) {
    
    g.drawRect(bottomX, bottomY, width, height);
    this.drawTriangle(g, bottomX, bottomY, width, height);
  }
  
  private void drawTriangle(Graphics g, int bottomX, int bottomY, int base, int height) {
    
    g.drawLine(bottomX, bottomY, bottomX+base, bottomY);
    g.drawLine(bottomX+base, bottomY, bottomX+base/2, bottomY-height);
    g.drawLine(bottomX+base/2, bottomY-height, bottomX, bottomY);
  }
}
