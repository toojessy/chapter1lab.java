at// Jessica Kamienski

import java.util.Scanner;

public class TemperatureConverter {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public static void main(String[] args) {
// I used ai because I was stuck on this the whole class period, don't know how to code java
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
