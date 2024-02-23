import java.awt.*;

class abc extends Frame {
    abc(String str){
        super(str);
    }
}

class AWTS {
    public static void main(String[] args) {
        abc obj = new abc("Gopi");
        obj.setSize(600, 600);
        obj.setVisible(true);
    }
}