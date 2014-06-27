import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ThreeBears extends Applet implements ItemListener {
  
  Bears myBear;
  String action;
  
  
  public void init() {
    resize (500,300);
    
    Choice actionList=new Choice(); 
    actionList.add("baby"); 
    actionList.add("mama");
    actionList.add("papa");
    
    actionList.addItemListener(this); 
    add(actionList); 
    
    myBear=new Bears(); 
    action=myBear.getActionImage(); 
  }
  
  public void paint (Graphics g) {
    
    Image myAction=getImage(getDocumentBase(), action);
    g.drawString(myBear.getAction(), 325, 150);
    g.drawString(myBear.getMessage(), 10, 10);
    g.drawImage(myAction, 20, 50, Color.white, this);
  }
  
  public void itemStateChanged(ItemEvent evt) {
    
    int whichOne=((Choice)evt.getItemSelectable()).getSelectedIndex();
    switch (whichOne) {
    case 0: action=myBear.baby();break;
    case 1: action=myBear.mama(); break;
    case 2: action=myBear.papa(); break;
    } 
    repaint(); 
  }
  
  
}
