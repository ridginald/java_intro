// what imports will you need?

public class ControlFlow {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    System.out.println(oddOrEven(num));
  }

  private static String oddOrEven(int num) {
    if (num % 2 == 0) {
      return num + " is even";
    }
    else {
      return num + " is odd";
    }
  }
}
