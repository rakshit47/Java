// import java.util.concurrent.TimeUnit;

class Test {
    static int hour = 0;
    static int minute = 0;
    static int second = 0;
    static int milisecond = 0;

    public static void display() {
        System.out.print('\r');
        System.out.print(hour + " : " + minute + " : " + second + " : " + milisecond);
        System.out.flush();
    }

    public static void delay() {
        try{
        Thread.sleep(9, 0);
        }catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public static void start() {
        while (true) {
            display();
            milisecond++;
            if (milisecond == 100) {
                second++;
                if (second == 100) {
                    minute++;
                    if (minute == 60) {
                        hour++;
                        if (hour == 100) {
                            hour = 0;
                        }
                        minute = 0;
                    }
                    second = 0;
                }
                milisecond = 0;
            }
            delay();
        }
    }

    public static void main(String[] args) {
        start();
    }
}