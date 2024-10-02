import java.util.Scanner;

public class DinnerMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Display the dinner menu
        System.out.println("Welcome to our dinner menu!");
        System.out.println("Please select what you'd like to have for dinner:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Salad");
        System.out.println("5. Sushi");

        // Get the user's choice
        System.out.print("Enter the number of your choice: ");
        choice = scanner.nextInt();

        // Compliment the user's choice based on the menu selection
        switch (choice) {
            case 1:
                System.out.println("Great choice! Pizza is always a good idea!");
                break;
            case 2:
                System.out.println("Yummy! A burger will definitely hit the spot!");
                break;
            case 3:
                System.out.println("Pasta is a perfect comfort food. Enjoy!");
                break;
            case 4:
                System.out.println("Healthy and fresh! Salad is an excellent choice!");
                break;
            case 5:
                System.out.println("Sushi is always a delight! Enjoy your meal!");
                break;
            default:
                System.out.println("Sorry, that's not a valid choice.");
        }

        // Close the scanner
        scanner.close();
    }
}