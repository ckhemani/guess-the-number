import java.util.Scanner;

public class Main {
    // Declare a Scanner Object
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Start Game
        startGame();

        //Finish Game
        System.out.println("\n Thank you for Playing");
    }

    //putting methods here
    public static void startGame(){
        System.out.println(getUserName());
        //Game Logic
    }
    // Getting User Name
    public static String getUserName() {
        System.out.println("Please enter your Name;");
        String name = scanner.next();
        return "Welcome " + name + " to the guess the number game!" ;
    }
}