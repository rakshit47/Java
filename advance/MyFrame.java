import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
    public MyFrame() {
        // Set the frame title
        setTitle("My Frame");
        
        // Set the frame size
        setSize(900, 900);
        
        // Add a close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        
        // Show the frame
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
