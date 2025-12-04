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
	#code changes for feature101 by Vivek -Oct 2024 of UserTransaction Module
	  public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.print("Amount to deposit to Checking Account: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }
    }
	#end of feature101 code
}