import java.awt.*;

public class app2 extends Frame {

    public void init(Graphics g){
        g.setColor(Color.green);
        g.drawString("Hello", 40, 40);
    }

    public static void main(String [] args){
        app2 m = new app2();
        Frame f = new Frame(null, null);
        f.add(m);
        f.setBackground(Color.MAGENTA);
        f.setSize(400, 400);
        f.setVisible(true);

    }
}
