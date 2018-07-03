public class JavaBuzz {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    if (num % 15 == 0) {
      System.out.println("FizzBuzz");
    }
    else if (num % 5 == 0) {
      System.out.println("Buzz");
    }
    else if (num % 3 == 0) {
      System.out.println("Fizz");
    }
    else {
      System.out.println(num);
    }
  }
}


// can you remember how to set up your main function?

// "Java" if divisible by 3
// "Buzz" if divisible by 5
// "JavaBuzz" if divisible by 15
