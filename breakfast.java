import java.util.Scanner;

public class breakfast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Display the breakfast menu
        System.out.println("\nGood morning, " + name + "!");
        System.out.println("What would you like to have for breakfast?");
        System.out.println("1. Pancakes");
        System.out.println("2. Omelette");
        System.out.println("3. Fruit Salad");
        System.out.println("4. Cereal");
        System.out.println("5. Toast with Jam");

        // Get the user's choice
        System.out.print("Enter the number corresponding to your choice: ");
        int choice = scanner.nextInt();

        // Greet the user based on their choice
        switch (choice) {
            case 1:
                System.out.println("Great choice, " + name + "! Enjoy your pancakes!");
                break;
            case 2:
                System.out.println("Yum! An omelette is a delicious way to start the day, " + name + "!");
                break;
            case 3:
                System.out.println("A fruit salad is refreshing! Enjoy it, " + name + "!");
                break;
            case 4:
                System.out.println("Cereal is a classic choice! Have a great breakfast, " + name + "!");
                break;
            case 5:
                System.out.println("Toast with jam is simple yet delightful! Enjoy, " + name + "!");
                break;
            default:
                System.out.println("Sorry, " + name + ". That's not a valid option.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}