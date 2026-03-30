package WALK;
import java.util.Scanner;
public class TestWalk {
	public static void main (String[] args) {
		int maxSteps; // maximum number of steps in a walk
		int maxCoord; // the maximum x and y coordinate
		int x, y; // starting x and y coordinates for a walk
		Scanner scan = new Scanner(System.in);
		System.out.println ("\nRandom Walk Test Program");
		System.out.println ();
		System.out.print ("Enter the boundary for the square: ");
		maxCoord = scan.nextInt();
		System.out.print ("Enter the maximum number of steps: ");
		maxSteps = scan.nextInt();
		System.out.print ("Enter the starting x and y coordinates with a space between: ");
		x = scan.nextInt();
		y = scan.nextInt();
		
		//2 walks
        RandomWalk walk1 = new RandomWalk(10, 5);
        RandomWalk walk2 = new RandomWalk(maxSteps, maxCoord, x, y);

        //Initial Position of both objects
        System.out.println("\nBeginning position for the walks:");
        System.out.println(walk1);
        System.out.println(walk2);

        //5 steps loop for each of the objects
        System.out.println("\nTaking 5 steps:");
        System.out.println ();
        for (int i = 1; i <= 5; i++) {
            walk1.takeStep();
            walk2.takeStep();
            System.out.println("Step " + i + " positions:");
            System.out.println(walk1);
            System.out.println(walk2);
            System.out.println ();
        }

        //3rd walk
        RandomWalk walk3 = new RandomWalk(200, 10);
        walk3.walk();
        System.out.println("\nFinal walk:");
        System.out.println(walk3);
		
	}
}