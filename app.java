//Program to Loops and Conditional Statements 
public class app {
    public static void main(String[] args) {
        // If-Else Statement
        if (true) {
            System.out.println("True");
        }
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        // While Loop
        int i = 1;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(" ");

        // Do-While Loop
        i = 11;
        do {
            System.out.println(i + " ");
            i++;
        } while (i < 10);

        // Switch Statement
        switch (i) {
            case 1:
                System.out.println("Value Statement");
                break;

            default:
                System.out.println("Default Statement");
                break;
        }
    }

}