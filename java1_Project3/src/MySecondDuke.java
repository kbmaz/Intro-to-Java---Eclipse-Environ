import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class MySecondDuke extends Applet {
  
  public void paint(Graphics graph) {
    
    graph.drawString("I am a waving duke", 10, 130);
    Image action = getImage(getDocumentBase(),"images/duke/dukeWave.gif");
    graph.drawImage(action, 10, 10, Color.white, this);
    
  }
    
  }
