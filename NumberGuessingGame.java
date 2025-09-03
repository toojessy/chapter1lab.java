// Jessica Kamienski
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess any number 1-100:");
        Scanner input = new Scanner(System.in);
        int myInt = -1;
        int secretNum = 27;
        
        while (myInt != secretNum) {
            myInt = input.nextInt();
            if (myInt > secretNum) {
                System.out.println("This is too high.");
            }
            else if (myInt < secretNum) {
                System.out.println("This is too low.");
            }
            else {
                System.out.println("Thats it!");
            }
        }
// used ai because I couldn't figure out how to close a while loop
        input.close();
    }
}
