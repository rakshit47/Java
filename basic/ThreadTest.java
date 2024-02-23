class A extends Thread {
  int i;

  public void run() {
    for (i = 1; i <= 5; i++) {
      System.out.println("\t from Thread A : i=" + i);
    }
    System.out.println("Exit from Thread A :");
  }
}

class B extends Thread {
  int j;

  public void run() {
    for (j = 1; j <= 5; j++) {
      System.out.println("\t from Thread B: j=" + j);
    }
    System.out.println("Exit from Thread B :");
  }
}

class C extends Thread {
  int k;

  public void run() {
    for (k = 1; k <= 5; k++) {
      System.out.println("\t from Thread C: k=" + k);
    }
    System.out.println("Exit from Thread C :");
  }
}

class ThreadTest {
  public static void main(String args[]) {
    new A().start();
    new B().start();
    new C().start();
  }
}