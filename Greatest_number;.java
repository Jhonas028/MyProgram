import java.util.Scanner;
public class Testingjava {
    public static void main(String[] args)
    {
   
   Scanner scan = new Scanner (System.in);
   
   int x, y, z;
   
   System.out.print("Number 1:");
      x = scan.nextInt();
    
    System.out.print("Number 2:");
      y = scan.nextInt();
   
   System.out.print("Number 3:");
      z = scan.nextInt();
   
   
     if (x > y ) {
        System.out.print ("Number 1 is the Greatest");
     } else if (y > z) {
        System.out.print ("Number 2 is the Greatest");
     } else {
        System.out.print ("Number 3 is the Greatest");
     }
        
        
        
        
        
        
    }
}