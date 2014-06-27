import java.applet.Applet;
import java.awt.Graphics;

public class EmployeeApplet extends Applet {

  Employee e1;
  Employee e2;

  public void init() {
    e1 = new Employee(40);
    e2 = new Employee(45);
    resize(600, 300);
  }

  public void paint(Graphics g) {
    g.drawString("The hours employee 1 works each week are " +e1.getHoursPerWeek()+ ".", 0, 15);
    g.drawString("The hours employee 2 works each week are " +e2.getHoursPerWeek()+ ".", 0, 45);

  }
}
