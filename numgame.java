import java.util.*;

class NumberGuessingGame {

    public void play() 
    {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int minnum = 1;
        int maxnum = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int randomNumber = rnd.nextInt(maxnum - minnum + 1) + minnum;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Guess the number between " + minnum + " and " + maxnum + ": ");
                int userGuess = sc.nextInt();

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Your final score: " + score);
        sc.close();
    }
}

public class numgame
{
     public static void main(String[] args) 
     {
        NumberGuessingGame ngm= new NumberGuessingGame();
        ngm.play();
        System.out.println("\n \tTHANK YOU");
     }
}
