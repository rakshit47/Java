class A extends Thread {
    public void run() {
        System.out.print("Hello World!");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("Hellow World!");
        }
    }

}

class C extends Thread {
    public void run() {
        System.out.print("Hellow World!");
    }
}

public class app {
    public static void main(String[] args) {
    }
}