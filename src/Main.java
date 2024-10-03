import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int random = rand.nextInt(1,11);
        int guess = 0;

        boolean validGuess = false;

        do {
            System.out.print("Enter a number from 1 to 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();
                if (guess <=10 && guess >= 1) {
                    validGuess = true;
                } else {
                    System.out.println("Please enter a valid guess");
                }
            } else {
                System.out.println("Please enter a valid guess");
                in.nextLine();
            }
        } while (!validGuess);

        if (guess == random) {
            System.out.println("Good job! You got it! The random number was " +
                    random + ", and you guessed " + guess + "!");
        } else if (guess > random) {
            System.out.println("You were too high! You guessed " + guess +
                    ", but the correct number was " + random);
        } else {
            System.out.println("You were too low! You guessed " + guess +
                    ", but the correct number was " + random);
        }

    }
}