import java.util.*;

public class Guess {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     Random rand = new Random();
     int numToGuess;  
     int guess;      
     int guessCount = 0; 

     //Generate 
     numToGuess = rand.nextInt(10) + 1;

     while (true) { 
         System.out.print("Enter your guess (1-10): ");
         guess = scan.nextInt();
         guessCount++;

         if (guess == numToGuess) {
             break; 
         }
         else if (guess < numToGuess) {
             System.out.println("Too low. Try again.");
         }
         else {
             System.out.println("Too high. Try again.");
         }
     }

     System.out.println("Congratulations! You guessed the number correctly.");
     System.out.println("It took you " + guessCount + " guesses.");

 }
}