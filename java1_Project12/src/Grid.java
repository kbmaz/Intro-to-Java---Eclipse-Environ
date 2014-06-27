import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends Applet implements ActionListener {

  Box Box1;
  Box Box2;
  Box Box3;
  Box Box4;
  Box Box5;
  Box Box6;
  Box Box7;
  Box Box8;
  Box Box9;
  Box Box10;
  Box Box11;
  Box Box12;
  Box Box13;
  Box Box14;
  Box Box15;
  Box Box16;
  String action;
  Color actionColor;

  public void init() {
    List actionList = new List(13);
    actionList.add("red");
    actionList.add("cyan");
    actionList.add("gray");
    actionList.add("pink");
    actionList.add("lightGray");
    actionList.add("white");
    actionList.add("orange");
    actionList.add("black");
    actionList.add("green");
    actionList.add("magenta");
    actionList.add("blue");
    actionList.add("yellow");
    actionList.add("darkGray");

    actionList.addActionListener(this);
    add(actionList);
    action = Box1.getActionImage();
    action = Box2.getActionImage();
    action = Box3.getActionImage();
    action = Box4.getActionImage();
    action = Box5.getActionImage();
    action = Box6.getActionImage();
    action = Box7.getActionImage();
    action = Box8.getActionImage();
    action = Box9.getActionImage();
    action = Box10.getActionImage();
    action = Box11.getActionImage();
    action = Box12.getActionImage();
    action = Box13.getActionImage();
    action = Box14.getActionImage();
    action = Box15.getActionImage();
    action = Box16.getActionImage();

    Box1 = new Box(0, 0, 50, 50, Color.darkGray);
    Box2 = new Box(50, 0, 50, 50, Color.yellow);
    Box3 = new Box(100, 0, 50, 50, Color.blue);
    Box4 = new Box(150, 0, 50, 50, Color.magenta);
    Box5 = new Box(0, 50, 50, 50, Color.green);
    Box6 = new Box(50, 50, 50, 50, Color.black);
    Box7 = new Box(100, 50, 50, 50, Color.pink);
    Box8 = new Box(150, 50, 50, 50, Color.cyan);
    Box9 = new Box(0, 100, 50, 50, Color.black);
    Box10 = new Box(50, 100, 50, 50, Color.orange);
    Box11 = new Box(100, 100, 50, 50, Color.white);
    Box12 = new Box(150, 100, 50, 50, Color.lightGray);
    Box13 = new Box(0, 150, 50, 50, Color.pink);
    Box14 = new Box(50, 150, 50, 50, Color.gray);
    Box15 = new Box(100, 150, 50, 50, Color.red);
    Box16 = new Box(150, 150, 50, 50, Color.cyan);

    resize(600, 300);
  }

  public void paint(Graphics g) {
    Box1.display(g);
    Box2.display(g);
    Box3.display(g);
    Box4.display(g);
    Box5.display(g);
    Box6.display(g);
    Box7.display(g);
    Box8.display(g);
    Box9.display(g);
    Box10.display(g);
    Box11.display(g);
    Box12.display(g);
    Box13.display(g);
    Box14.display(g);
    Box15.display(g);
    Box16.display(g);
  }

  public void actionPerformed(ActionEvent evt, Color actionColor) {
    String userChoice = evt.getActionCommand();
    if (userChoice == "red")
      actionColor = (Color.red);
  }

  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub

  }

}
