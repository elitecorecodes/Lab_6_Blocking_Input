import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int randomNumber = generator.nextInt(10) + 1;

        int guess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Enter your guess from 1 to 10: ");


            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();


                if (guess >= 1 && guess <= 10) {
                    done = true;
                } else {
                    System.out.println("Your guess must be between 1 and 10.");
                }
            } else {
                trash = in.nextLine();
                System.out.println("You entered " + trash + ". Please enter a valid integer from 1 to 10.");
            }

        } while (!done);
        System.out.println("The random number was: " + randomNumber);

        if (guess > randomNumber) {
            System.out.println("Your guess was high!");
        } else if (guess < randomNumber) {
            System.out.println("Your guess was low!");

        } else {
            System.out.println("Your guess was on the money!");
        }
    }
}

