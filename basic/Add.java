class Increment {
  public static void main(String args[]) {
    int x, y;
    x = 20;
    y = 30;
    System.out.print("\033[H\033[2J");
    System.out.println("x=" + (+x));
    System.out.println("y=" + (+y));
    System.out.println("++x=" + ++(x));
    System.out.println("++y=" + ++(y));
    System.out.println("x++=" + x++);
    System.out.println("y++=" + y++);
    System.out.println("x=" + x);
    System.out.println("y=" + y);
  }
}
