import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args)
    {
        
        
    Scanner scan = new Scanner (System.in);
        
    int grade;
    
    System.out.print("Your Grade:");
          grade  = scan.nextInt();
        
       
      
    if (grade >= 80) {
        System.out.print("A");
    } else if (grade > 60 & grade < 80) {
        System.out.print("B");
    } else if (grade > 50 & grade < 60) {
        System.out.print("C");
    } else if (grade > 45 & grade < 50) {
        System.out.print("D");
    } else if (grade > 25 & grade < 45) {
        System.out.print("E"); 
    } else if (grade > 0 & grade <  25) {
        System.out.print("F");
    } else {
        System.out.print("G");
    }
   
   
      
        
        
        
    }
}