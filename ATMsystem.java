import java.util.Scanner;

public class ATMsystem {

    // Input variables
    private String userLanguage;
    private double accountBalance;
    
    // Output variables
    private double cashDispensed;
    private String successfulText;
    private double updatedAccount;
    private String receipt;
    
    Scanner scanner = new Scanner(System.in);

    // Constructor to initialize account balance
    public ATMsystem(double initialBalance) {
        this.accountBalance = initialBalance;
    }

    // Select language
    public void selectLanguage() {
        System.out.println("Select Your Language (EN/ID): ");
        userLanguage = scanner.nextLine();
        if (!userLanguage.equalsIgnoreCase("EN") && !userLanguage.equalsIgnoreCase("ID")) {
            System.out.println("Invalid Language, defaulting to EN.");
            userLanguage = "EN";
        }
        System.out.println("Language Selected: " + userLanguage);
    }

    // Insert ATM card
    public void insertATMCard() {
        System.out.println("Insert your ATM Card (Enter card number): ");
        scanner.nextLine();
        System.out.println("ATM Card Inserted.");
    }

    // Input PIN
    public void inputPIN() {
        System.out.println("Enter your PIN: ");
        scanner.nextLine();
        System.out.println("PIN Accepted.");
    }

    // Deposit cash method
    public void depositCash() {
        System.out.println("Enter the amount to deposit: ");
        double depoCash = scanner.nextDouble();
        accountBalance += depoCash;

        // Update the output variables
        successfulText = "Deposit Successful!";
        updatedAccount = accountBalance;
        receipt = "Deposit Receipt: Amount Deposited = " + depoCash + ", New Balance = " + updatedAccount;

        // Print outputs
        System.out.println(successfulText);
        System.out.println("Updated Account Balance: " + updatedAccount);
        System.out.println("Receipt: " + receipt);
    }

    // Withdraw cash method
    public void withdrawCash() {
        System.out.println("Enter the amount to withdraw: ");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount <= accountBalance) {
            cashDispensed = withdrawalAmount;
            accountBalance -= withdrawalAmount;

            // Update the output variables
            successfulText = "Withdrawal Successful!";
            updatedAccount = accountBalance;
            receipt = "Withdrawal Receipt: Amount Withdrawn = " + cashDispensed + ", New Balance = " + updatedAccount;

            // Print outputs
            System.out.println("Cash Dispensed: " + cashDispensed);
            System.out.println(successfulText);
            System.out.println("Updated Account Balance: " + updatedAccount);
            System.out.println("Receipt: " + receipt);
        } else {
            System.out.println("Insufficient Balance. Withdrawal Failed.");
        }
    }

    // Main function to execute the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize ATM system with an initial balance of 5000
        ATMsystem atmSystem = new ATMsystem(5000.00);

        // ATM process
        atmSystem.selectLanguage();
        atmSystem.insertATMCard();
        atmSystem.inputPIN();

        // User selects operation: deposit or withdraw
        System.out.println("Choose Operation: 1. Deposit  2. Withdraw");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                atmSystem.depositCash();
                break;
            case 2:
                atmSystem.withdrawCash();
                break;
            default:
                System.out.println("Invalid Operation.");
        }

        scanner.close();
    }
}
