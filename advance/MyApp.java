import java.applet.*;
import java.awt.*;

public class MyApp extends Applet {
  public void init() {
    setBackground(Color.yellow);
  }

  public void paint(Graphics g) {
    g.drawString("Hello Aquib", 50, 100);
  }

}

/* 
<applet code="MyApp.class" width="1000" height="1000"> 
</applet> 
*/ 