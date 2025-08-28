// Jessica Kamienski

import java.util.Scanner;

public class Temp {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
// I used ai
        String input = getInput("Enter temperature in Fahrenheit: ");
        try {
            double fahrenheit = Double.parseDouble(input);
            double celsius = (fahrenheit - 32) * 5 /9;
            System.out.println(fahrenheit + "°F is " + celsius + "°C");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid numeric temperature.");
        }
        scanner.close();

    }

}
