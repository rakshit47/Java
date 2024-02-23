class a extends Thread {
    public void rund() {
        int[] num = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i : num) {
            System.out.print(i + ", ");
        }
    }
}

public class app9 {

    // public void run() {
    //     int[] cars = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    //     for (int i : cars) {
    //         System.out.print(i + ", ");
    //     }
    // }

    public static void main(String[] args) {
        app9 obj = new app9();
        
        // a obj2 = new a();
        // Thread t1 = new Thread(obj);
        // Thread t2 = new Thread(obj2);
        // t1.start();
        // t2.start();
        // obj2.start();
    }
}
