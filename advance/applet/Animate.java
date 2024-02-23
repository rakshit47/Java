import java.awt.*;
import java.applet.*;

public class Animate extends Applet {
  public void paint(Graphics g) {
    Image img = getImage(getDocumentBase(), "bike_1.gif");
    for (int x = 0; x < 2000; x++) {
      g.drawImage(img, x, 0, null);
      try {
        Thread.sleep(5);
      } catch (InterruptedException ie) {

      }
    }
  }
}

/*
 * <applet code="Animate.class" width="3000" height="900">
 * </applet>
 */