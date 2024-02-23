import java.awt.*;
import java.applet.*;


public class app extends Applet{
    public void init(){
        setForeground(Color.black);
    }

    public void paint(Graphics g){
        Image img = getImage(getDocumentBase(), "bike_1.gif");
        g.drawImage(img, 0, 0, null);
    }
}

// <applet code = "app.class" height="300" width="600" ></applet> 