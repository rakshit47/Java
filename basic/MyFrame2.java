import java.awt.*;
import java.awt.event.*;
class MyFrame2 extends Frame 
{
  public static void main(String args[])
  {
   MyFrame2 f = new MyFrame2();
    f.setTitle("My second AWT Frame");
   f.setSize(300,250);
   f.setVisible(true);
   f.addWindowListener(new Myclass());
  }
}
 class Myclass extends WindowAdapter
  {
   public void windowClosing(WindowEvent e)
   {
     System.exit(0);
    }
  }