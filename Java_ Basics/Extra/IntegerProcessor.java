
import java.util.*;
import java.io.*;

public class IntegerProcessor {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner fileScanner = new Scanner(new File("intList.txt"));

        while (fileScanner.hasNextInt()) {
            numbers.add(fileScanner.nextInt());
        }

        Iterator<Integer> iterator = numbers.iterator();
        int sum = 0;
        int count = 0;

        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.println(num);
            sum += num;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}