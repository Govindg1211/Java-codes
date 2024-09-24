public class try_catch {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int num = 10 / 0; // This will throw an ArithmeticException
            System.out.println("Result: " + num);
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("Error: Cannot divide by zero!");
            System.out.println("Exception message: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Code that will always be executed, regardless of whether an exception was thrown
            System.out.println("Program continues...");
        }
    }
}