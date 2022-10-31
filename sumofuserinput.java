import java.util.Scanner;

public class sumofuserinput {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int userinput,sum = 1;
        int y;
        int x = 1;
        
        System.out.print("Enter number: ");
            userinput = scan.nextInt();
            
        System.out.print(x);
        for (int i = 1; i < userinput; i++) {
            y = i + 1;
            sum = y + sum;

         System.out.print("+" + y);
            
        }
           
        System.out.print("= " + sum);
       
    }
}