import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    //Declare a Scanner object
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Start Game
        startGame();

        //Finish Game
        System.out.println("\nThank you for plaing!");
    }

    //Putting methods here
    public static void startGame() {
        System.out.println(getUserName());

        //Game Logic
        do {
            int numberToGuess = generateRandomNumber();
            //User pick number
            System.out.println(pickANumber());
            for(int i = 0; i < 6; i++) {
                System.out.println(numberToGuess);
                if(numberToGuess != guess()) {
                    if(i == 5) {
                        System.out.println("You loose");
                        break;
                    }
                    System.out.println("Please guess again");
                } else {
                    System.out.println("Congrats you Won!");
                    break;
                }
            }
        } while (keepPlaying());
    }

    //Get User Guess
    public static int guess() {
        int guess = 0;
        try {
            guess = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return guess;
        }
        return guess;
    }

    public static String pickANumber() {
        return "Please pick a number from 0 to 10";
    }

    //Generate Random Number
    public static int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1, 10);
    }

    //Play on or not
    public static boolean keepPlaying() {
        System.out.println("(1) Play (2) Stop");
        String play = scanner.next();
        //the .equals method will return true or false
        return play.equals("1");
    }

    //Getting user name
    public static String getUserName() {
        System.out.println("Please enter your name: ");
        String name = scanner.next();
        return "Welcome " + name + " to the guess the number game!";
    }
}