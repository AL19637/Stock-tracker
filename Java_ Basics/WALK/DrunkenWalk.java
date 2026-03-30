package WALK;
import java.util.Scanner;
public class DrunkenWalk {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int boundary;
        int maxSteps;
        int numDrunk;
        int falls = 0;
        
        //Entering the values
        System.out.print("Enter the boundary of the platform: ");
        boundary = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the number of simulations: ");
        numDrunk = scan.nextInt();

        //Simulate
        for (int i = 0; i < numDrunk; i++){
            RandomWalk drunk = new RandomWalk(maxSteps, boundary);
            drunk.walk();
            //Fell off count
            if (drunk.inBounds() == false) {
                falls++;
            }
        }

        System.out.println("Number of times the drunk fell off is: " + falls);
    }
}