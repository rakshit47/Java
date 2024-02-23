import java.awt.*;
import java.awt.event.*;


public class MyFrame2 extends Frame{

    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
        f.setTitle("This is a Frame");
        f.setSize(500, 500);
        f.setVisible(true);
        f.addWindowListener(new MyClass());
    }
}

class MyClass extends WindowAdapter{
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}