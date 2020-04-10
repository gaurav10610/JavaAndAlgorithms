package basic;

public class FindGCD {

  public static void main(String[] args) {
    int a = 100;
    int b = 150;
    System.out.println("GCD of " + a + " and " + b + " is " + getGCD(a, b));
  }

  public static int getGCD(int a, int b) {
    return b == 0 ? a : getGCD(b, a % b);
  }

}
