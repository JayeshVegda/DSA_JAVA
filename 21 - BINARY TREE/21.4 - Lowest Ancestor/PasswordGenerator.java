import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Generate Password");
            System.out.println("2. Exit");
            int choice = getValidChoice(scanner);

            if (choice == 2) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter the desired password length (8-32):");
            int length = getValidLength(scanner);

            String password = generatePassword(length);
            System.out.println("Generated Password: " + password);

            while (true) {
                System.out.println("Would you like to:");
                System.out.println("1. Regenerate Password");
                System.out.println("2. Exit");
                choice = getValidChoice(scanner);

                if (choice == 2) {
                    System.out.println("Exiting...");
                    return;
                }

                password = generatePassword(length);
                System.out.println("Generated Password: " + password);
            }
        }
    }

    private static int getValidChoice(Scanner scanner) {
        int choice;
        while (true) {
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                }
            } else {
                scanner.next(); 
            }
            System.out.println("Please enter a valid choice (1 or 2):");
        }
        return choice;
    }

    private static int getValidLength(Scanner scanner) {
        int length;
        while (true) {
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
                if (length >= 8 && length <= 32) {
                    break;
                }
            } else {
                scanner.next(); 
            }
            System.out.println("Please enter a valid length (8-32):");
        }
        return length;
    }

    private static String generatePassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }
}
