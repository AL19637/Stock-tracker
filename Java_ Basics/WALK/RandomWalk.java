package WALK;
// ************************************************************
// RandomWalk.java
//
// Class for a random walk on a square.
// ************************************************************
import java.util.Random;
public class RandomWalk {
    private int x;
    private int y;
    private int maxSteps;
    private int numSteps;
    private int boundary;
    private Random ran = new Random();

    //1 constructor
    public RandomWalk(int max, int edge){
        maxSteps = max;
        boundary = edge;
        x = 0;
        y = 0;
        numSteps = 0;
    }

    //2 constructor
    public RandomWalk(int max, int edge, int startX, int startY){
        maxSteps = max;
        boundary = edge;
        x = startX;
        y = startY;
        numSteps = 0;
    }

    //toString 
    public String toString(){
        return "Steps: " + numSteps + "; Position: (" + x + "," + y +")" ;
    }

    //The random steps and the positions
    public void takeStep(){
    	int direction = ran.nextInt(4);
        if (direction == 0)             //right
            x++;
        else if (direction == 1)        //left
            x--;
        else if (direction == 2)        //up
            y++;
        else                            //down
            y--;
        numSteps++;
    }

    //Are more steps allowed
    public boolean moreSteps() {
        return numSteps < maxSteps;
    }

    //Inside the boundary
    public boolean inBounds(){
    	return (x <= boundary && x >= -boundary) && (y <= boundary && y >= -boundary);
    }

    //Finished walk
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
}