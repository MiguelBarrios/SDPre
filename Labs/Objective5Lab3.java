import java.util.Scanner;

public class Objective5Lab3 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int userNum;

      System.out.println("Please enter a number: ");

      int input = scanner.nextInt();

      if(input < 0){
        System.out.println("The number is negative");
      }
      else if (input > 0){
        System.out.println("The number is positive");
      }
      else {
        System.out.println("The number is neither positive or negative");
      }

      scanner.close();
  }
}
