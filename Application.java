import java.util.Scanner;

public class ProgramStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // program code
        System.out.println("Let's try if we can travel to the method world:");
        greet();

        System.out.println("Looks like we can, let's try again:");
        greet();
        greet();
        greet();
    }

    // own methods
    public static void greet() {
        System.out.println("Greetings from the method world!");
    }
	#Code changes for feature102 by Ethan- on UserReports Module on oct2024
	public void getAccountType() {
        System.out.println("Select Account Type you want to Access");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Savings Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        // Handles user selection
        switch (selection) {
            case 1 -> getChecking(); // Redirects to checking account menu
            case 2 -> getSaving();   // Redirects to saving account menu
            case 3 -> System.out.println("Thank you for using ATM, BYE\n"); // Exit message
            default -> System.out.println("\n Invalid Choice \n"); // Handles invalid input
        }
    }
	#end of code changes feature102
}