class Lcm {
  public static void main(String args[]) {

    int a = 10;
    int b = 20;
    int lcm = 0;
    lcm = (a > b) ? a : b;
    while (true) {
      if (lcm % a == 0 && lcm % b == 0) {
        System.out.println(lcm);
        break;
      }
      ++lcm;
    }
  }
}
