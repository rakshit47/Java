import java.awt.*;
import javax.swing.*;

public class awt extends Canvas {
    public void paint(Graphics g){
        g.drawImage("bike_1.gif", 200, 200, getFocusCycleRootAncestor());
    }
    public static void main(String[] args) {
        
    }
}
