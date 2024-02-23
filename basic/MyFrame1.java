import java.awt.*;
import java.awt.event.*;
 class MyFrame1 extends Frame
{
  public static void main (String args[])
  {
   MyFrame1 f = new MyFrame1();
   f.setTitle("My AWT Best Frame");
   f.setSize(500,450);
   f.setVisible(true);
   f.addWindowListener(new Myclass());
   }
}
   class Myclass implements WindowListener
 {
   public void windowActivated(WindowEvent e){}
   public void windowClosed(WindowEvent e){}
   public void windowClosing(WindowEvent e)
   {
    System.exit(0);
    }
     public void windowDeactivated(WindowEvent e){}
   public void windowDeiconified(WindowEvent e){}
   public void windowIconified(WindowEvent e){}
    public void windowOpened(WindowEvent e){}
 } 