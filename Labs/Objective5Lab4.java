import java.util.Scanner;

class Objective5Lab4{
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Please enter a number");

      int input = scanner.nextInt();

      if(input % 2 == 0){
        System.out.println("The number is even.");
      }
      else{
        System.out.println("The number is odd");
      }
  }
}
