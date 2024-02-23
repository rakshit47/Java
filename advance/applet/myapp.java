import java.awt.*;
import java.rmi.*;
import java.applet.Applet;
import javax.swing.*;

public class myapp extends Applet
{
 public void init()
  {
    setForeground(Color.yellow);
   }

 public void paint(Graphics g)
  {
    g.drawString("Hello Applet",150,200);
  	}
}
/*
 <applet code="MyApp.class" height="300" width="500"></applet>
*/