import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int option = 0;
    static int guess;
    static int attempts;
    static int randomNumber = random.nextInt(1,101);

    public static void main(String[] args){

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)");
        System.out.println("2. Medium (5 chances)");
        System.out.println("3. Hard (3 chances)\n");
        option = scanner.nextInt();

        System.out.println(randomNumber);
        switch(option){
            case 1 -> game(10);
            case 2 -> game(5);
            case 3 -> game(3);

            default -> System.out.println("Wrong option");

        }
    }
    static void game(int limit){
        System.out.print("Enter your guess: ");
        guess = scanner.nextInt();
        attempts++;

        while(guess != randomNumber){
            while(attempts != limit){
                if(guess > randomNumber){
                    System.out.print("Too high, Try again: ");
                }

                else {
                    System.out.print("Too low, Try again: ");
                }
                attempts++;
                guess = scanner.nextInt();
            }
            System.out.println("You have no more attempts");
        }
        System.out.println("You have guessed it correctly");
    }
}