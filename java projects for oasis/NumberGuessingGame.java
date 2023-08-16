import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame
{
    public static void main(String[] args)
     {
        Random rand = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            int randomNumber = rand.nextInt(100) + 1;
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                      !WELCOME TO NUMBER GUESSING GAME! ");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------\n");

           // System.out.println("\nRandom number is  " + randomNumber );
           int tryCount = 0;

        while(true){
            System.out.println("Enter your guess (1-100):\n");

             int playerGuess = scanner.nextInt();
             tryCount++;
             
             if(playerGuess == randomNumber){
                System.out.println("Correct! Your Win!");
                System.out.println("It took you "+ tryCount + " tries");
                break;
             }
             else if(randomNumber > playerGuess){
                System.out.println("Nope! The number is higher. Guess again.");
             }
             else{
                System.out.println("Nope! The number is lower. Guess again." );
             }
        }
          scanner.close();
    }
  
        
    }
}