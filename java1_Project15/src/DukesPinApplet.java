import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DukesPinApplet extends Applet implements ItemListener {

  DukesPin myDuke;
  String action;
  Checkbox showPin;
  Graphics g;

  public void init() {
    resize (400,200);
    Choice actionList = new Choice();
    actionList.add("wave");
    actionList.add("think");
    actionList.add("write");

    actionList.addItemListener(this);
    add(actionList);

    myDuke = new DukesPin();
    action = myDuke.getActionImage();

    Checkbox changeMood = new Checkbox("Angry", myDuke.isAngry());
    add(changeMood);
    changeMood.addItemListener(this);

    showPin = new Checkbox("ShowPin");
    add(showPin);
    showPin.addItemListener(this);
  }

  public void paint(Graphics g) {
    this.g = g;
    Image actionChoice = getImage(getDocumentBase(), action);
    g.drawString(myDuke.getAction(), 10, 165);
    g.drawString(myDuke.getMessage(), 10, 180);
    g.drawImage(actionChoice, 20, 50, Color.white, this);

    g.drawString(myDuke.getAngryMessage(), 110, 140);
    if (myDuke.isShowingPin())
      makePin();
    else
      clearPin();
  }

  public void itemStateChanged(ItemEvent evt) {
    if (evt.getItem().toString() == "Angry") {
      myDuke.setMood();
      if (!myDuke.isAngry())
        showPin.setState(false);
    }
    else
      if (evt.getItem().toString() == "ShowPin") {
        myDuke.switchShowingPin();
        if (showPin.getState() && !myDuke.isAngry())
          showPin.setState(false);
      }
      else {
        int which = ((Choice) evt.getItemSelectable()).getSelectedIndex();
        switch (which) {
          case 0:
            action = myDuke.wave();
            break;
          case 1:
            action = myDuke.think();
            break;
          case 2:
            action = myDuke.write();
            break;
        }

      }
    repaint();
  }

  public void makePin() {
    PinImages images = new PinImages();
    // make Pin
    g.setColor(Color.yellow);
    g.fillOval(160, 50, 100, 100);
    // put something in Pin
    g.setColor(Color.orange);
    g.drawString(" Don't worry; ", 175, 80);
    g.setColor(Color.orange);
    g.drawString(" be happy! ", 180, 130);
    //draw smiley face
    g.setColor(Color.black);
    g.fillOval(190, 85, 10, 10); 
    g.fillOval(210, 85, 10, 10);
    g.fillOval(200, 95, 7, 7);
    g.drawArc(185, 100, 40, 10, 190, 185);
    
  }

  public void clearPin() {
    g.setColor(Color.white);
    g.fillOval(120, 50, 80, 80);
  }

}
