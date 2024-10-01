import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random rand = new Random();
        
        // Generate a random integer between 1 and 100
        int randomNum = rand.nextInt(100) + 1;
        
        // Print the random number
        System.out.println("Random number: " + randomNum);
    }
}