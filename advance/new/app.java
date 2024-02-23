import java.awt.*;  
import javax.swing.JFrame;  
  
public class app extends Canvas{  
      
    public void paint(Graphics g) {  
        g.clipRect(200, 150, 60, 30);
        // g.drawOval(200, 60, 180, 30);
        // g.drawLine(130, 30,100, 80);  
        // g.drawOval(30,130,50, 60);  
        // setForeground(Color.RED);  
        // g.fillOval(130,130,50, 60);  
        // g.drawArc(30, 200, 40,50,90,60);  
        // g.fillArc(30, 130, 40,50,180,40);  
          
    }  
        public static void main(String[] args) {  
        app m=new app();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }  
  
}  