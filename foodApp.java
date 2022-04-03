import java.util.Scanner;

public class foodApp {
    public static void main(String[] args) throws Exception {
        displayMainMenu();
    }

    public static int displayMainMenu()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to our restuarant!.");
        System.out.println("##########################");
        System.out.println("Please select an option");
        System.out.printf("1. View Menu\n2. Order\n3. Checkout\n4. Exit\n"); 
        int choice = input.nextInt();
        return choice;
    }
}