import java.time.*;   
import java.util.*;   
class DifferenceDateProgram{      
    static void find(LocalDate  first_date, LocalDate second_date)   
    {   
          
        Period difference = Period.between(first_date, second_date);    
        System.out.print("Difference between two dates is:\n");   
        System.out.printf( "%d days, %d months and %d years",   
            difference.getDays(),  
            difference.getMonths(),   
            difference.getYears());   
    }   
    // Main class  
    public static void main(String[] args)   
    {   
         
        LocalDate first_date = LocalDate.of(1997, 02, 15);   
        LocalDate second_date = LocalDate.of(2016, 03, 22);   
          
        find(first_date, second_date);   
    }   
}  