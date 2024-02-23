import java.awt.*;
import java.applet.*;
class MyApp extends Applet
{
 public void init( )
{
  setBackground(Color.yellow);
}
 public void paint(Graphics g )cd documentcd
{
  g.drawString("Hello Applets", 50, 100);
}
}