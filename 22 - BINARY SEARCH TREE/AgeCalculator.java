import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their birth date
        System.out.print("Enter your birth year (YYYY): ");
        int year = scanner.nextInt();
        
        System.out.print("Enter your birth month (MM): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter your birth day (DD): ");
        int day = scanner.nextInt();

        // Create a LocalDate object for the birth date
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age
        Period age = Period.between(birthDate, currentDate);


        age.
        // Display the result
        System.out.println("You are " + age.getYears() + " years, " 
                + age.getMonths() + " months, and " + age.getDays() + " days old.");

        scanner.close();
    }
}