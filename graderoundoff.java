import java.util.Scanner;

public class graderoundoff {
    public static void main(String args[]) {
     
    Scanner scan = new Scanner(System.in);
    
    double male, female;
    
    System.out.print("Enter the number of males: ");
        male = scan.nextDouble();
    System.out.print("Enter the number of females: ");
        female = scan.nextDouble();
        
    double total = male + female;
    int initotal = (int) total;
    
    System.out.println("Number of students: " + initotal);
    
    double maleper = (male / total) * 100;
    double femaleper = (female / total) * 100;
    double rounded = Math.round(maleper * 100)/100.0;
    double rounded1 = Math.round(femaleper * 100)/100.0;
    
    System.out.println("Male = " + rounded + "%");
    System.out.print("Female = " + rounded1 + "%");
    
    
     
     
    }
}

