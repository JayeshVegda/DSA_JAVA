import java.time.*; 
import java.util.*; 

System.out.println(
    "You are " + 
    Period.between(
        LocalDate.of(
            new Scanner(System.in).nextInt(), 
            new Scanner(System.in).nextInt(), 
            new Scanner(System.in).nextInt()), 
        
        LocalDate.now()).getYears() + " years, " +
        
        Period.between(
            LocalDate.of(
                new Scanner(System.in).nextInt(), 
                new Scanner(System.in).nextInt(), 
                new Scanner(System.in).nextInt()), 
                
                LocalDate.now()).getMonths() + " months, and " + 
                
                Period.between(LocalDate.of(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()), LocalDate.now()).getDays() + " days old.");
