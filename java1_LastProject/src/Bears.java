
public class Bears {
  
  private String action;
  private String whatDoing;
  private String message = "";
  
  public Bears() {
    
    action = this.action;
    whatDoing = this.whatDoing;
    message = this.message;
  }
  
  public String getAction()
  {
    return whatDoing;
  }
  public String getActionImage()
  {
    return action;
  }
  public String getMessage()
  {
    return message;
  }
  
  public String baby()
  {
    whatDoing = "This is Baby Bear's house.";
    action = "../src/images/babybear.jpg";
    message = "";
    
    return action;
  }
  
  public String mama()
  {
    whatDoing = "This is Mama Bear's house.";
    action = "../src/images/mamabear.jpg";
    message = "";
    
    return action;
  }
  
  public String papa()
  {
    whatDoing = "This is Papa Bear's house.";
    action = "../src/images/papabear.jpg";
    message = "";
    
    return action;
  }
}
