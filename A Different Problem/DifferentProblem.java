import java.util.Scanner;

public class DifferentProblem{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextLong()) {
      long a = sc.nextLong() - sc.nextLong();
      System.out.println((a < 0) ? -a : a);
    }

  }
}
