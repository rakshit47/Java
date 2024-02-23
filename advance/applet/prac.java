import java.awt.*;
import java.applet.*;

public class prac extends Applet {

    public void paint(Graphics g) {
      g.setFont(new Font("Poppins", Font.PLAIN, 32));
      for (int i = 0; i < 2000; i+=24) {
          g.drawString("Aditya Sharma Gay", 200, i);
            try {
                Thread.sleep(5);
            } catch (InterruptedException ie) {

            }
        }
    }
}