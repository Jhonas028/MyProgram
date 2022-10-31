import java.util.Scanner;

public class Labexercise {
    public static void main (String[]args) {
        
    Scanner scan = new Scanner(System.in);
    
    int level;
    double baseAS;
    double bonusAS;
    
    
    System.out.print("Enter the base attack speed: ");
        baseAS = scan.nextDouble();
    System.out.print("Enter the bonus attack speed %: ");
        bonusAS = scan.nextDouble();
    System.out.print("Enter the level: ");
        level = scan.nextInt();
   
    double convert = bonusAS/100;
    double currentAS = baseAS * (1 + (convert * (level - 1)));
    System.out.printf("The character's current attack speed is " + "%.3f",currentAS);
   
   
    }
}