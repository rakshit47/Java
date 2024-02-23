class One {
  int i = 10;

  void show() {
    System.out.println("super class method i = " + i);
  }
}

class Two {8
  ''
  int i = 20;

  void show() {
    System.out.println("super class method i = " + i);
  }
}

class Super1 {
  public static void main(String args[]) {
    Two t = new Two();
    t.show();
  }
}