// class a extends Thread {
//     public void run() {
//         int[] cars = { 1, 2, 3, 4, 5, 6 };
//         for (int i : cars) {
//             System.out.print(i);
//         }
//     }
// }

// class b extends Thread {
//     public void run() {
//         int[] cars = { 4, 5, 6, 7, 8, 9, 0 };
//         for (int i : cars) {
//             System.out.print(i);
//         }
//     }
// }

public class app implements Runnable {
    public void run() {
        int[] cars = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        for (int i : cars) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        app obj = new app();
        Thread t = new Thread(obj);
        t.start();
        try {
            t.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        // obj.start();

        int[] cars = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        for (int i : cars) {
            System.out.println(i);
        }
    }

}