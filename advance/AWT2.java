import java.awt.*;
import java.awt.event.*;
public class AWT2 extends Frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("This is a Frame");
        f.setSize(500,500);
        f.setVisible(true);
        f.addWindowListener(new MyClass());
    }
}
class MyClass extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
