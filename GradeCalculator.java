import java.util.Scanner;

public class GradeCalculator {
  public static void main (String[] args) {
      System.out.println("Enter 3 test scores: ");
      Scanner input = new Scanner(System.in);
      
      int score1 = input.nextInt();
      int score2 = input.nextInt();
      int score3 = input.nextInt();
      double math = (score1 + score2 + score3) / 3;
      System.out.println("Your average is: " + math);
      
      if (math >= 90) {
          System.out.println("You have an 'A' average!");
      }
          else if (math >= 80 && math <= 89) {
          System.out.println("You have a 'B' average!");
          }
          else if (math >= 70 && math <= 79) {
              System.out.println("You have a 'C' average.");
          }
          else if (math >= 60 && math <=69) {
              System.out.println("You have a 'D' average.");
          }
          else if (math < 60) {
              System.out.println("You have an 'F', you're failing..");
          }
  }
}
