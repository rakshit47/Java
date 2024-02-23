import java.awt.*;
import java.applet.*;

public class prac2 extends Applet {

    public void paint(Graphics g) {
        Image img = getImage(getDocumentBase(), "bike_1.gif");
        for (int i = 1000; i > 0; i--) {
            g.drawImage(img, 20, i, null);
            try {
                Thread.sleep(5);
            } catch (InterruptedException ie) {

            }
        }
    }
}