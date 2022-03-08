import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Hello!. What is your Name?");
        String Name = inputName.nextLine();
        System.out.println("Well, " + Name + " ,I am thinking a number between 1 and 20.");
        Random generator = new Random();
        int randomNum = generator.nextInt(20);
        int attempt = 0;
        System.out.println("Take a Guess");
        int guessNum = 0;

        do {
            guessNum = inputName.nextInt();
            if (guessNum > randomNum) {
                System.out.println("Your Guess is too High!");
                attempt += 1;
            }
            else if( guessNum < randomNum) {
                System.out.println("Your Guess is too Low!");
                attempt +=1;
            }
            else {
                System.out.println("Your Guess was right!");
                attempt +=1;
            }
        } while (guessNum != randomNum);

        System.out.print(randomNum + " is the correct answer and it took you " + attempt + " attempts to guess it!");
    }
}
