import java.util.Scanner;

public class bankingSystem {
    public static void main(String[] args) {
       
    Scanner scan = new Scanner(System.in);
       
       String fname, lname, add;
       int pin;
       Double depfee;
       System.out.println("===================================");
       System.out.println("        Welcome to Banking System");
       System.out.println("===================================\n");
       
       System.out.println("===================================");
       System.out.println("       Create Account");
       System.out.println("===================================\n");
       
       System.out.print("Enter First Name: ");
        fname = scan.nextLine();
       System.out.print("Enter Last Name: ");
        lname = scan.nextLine();
       System.out.print("Address: ");
        add = scan.nextLine();
       System.out.print("Deposit fee: ");
        depfee = scan.nextDouble();
       System.out.print("PIN code: ");
        pin = scan.nextInt();
       
       System.out.println("==============================");
       System.out.println("       Account Info");
       System.out.println("==============================\n");
       
       System.out.println("Account balance: " + depfee);
       System.out.println("Full Name: " + fname + " " + lname);
       System.out.println("Address: " + add);
       
       System.out.println("==============================");
       System.out.println("      Enter your PIN");
       System.out.println("==============================");
       
       int pins;
       
       System.out.print("Enter your PIN Code: ");
            pins = scan.nextInt();
       System.out.println("Verifying identity....\n");
      
       
       
            
        if(pins == pin) {
            System.out.println("PIN verified!\n");
            System.out.println("==============================");
            System.out.println("      Welcome to the Bank");
            System.out.println("==============================");
            
        Double inrate;
        Double depamt;
       
        
        System.out.print("Enter Interest Rate: ");
            inrate = scan.nextDouble();
        System.out.print("Enter Deposit amount: ");
            depamt = scan.nextDouble();
            
            
        Double bal2 = (((depamt * inrate) + depfee) + depamt);
        
        System.out.println("Your new balance is " + bal2);
        
        char action;
        
        
        System.out.println("Press [D] if you want to deposit");
        System.out.println("Press [W] if you want to withdraw\n");
        
        System.out.print("Type the key: ");
                action = scan.next().charAt(0);
        
      
        Double depamt2;
        int base = 0;
        
        if (action == 'D') {
            System.out.print("Enter Deposit amount: ");
                depamt2 = scan.nextDouble();
                
            if ( depamt2 < base) { 
                System.out.println("Invalid amount");
            }else {
                
            Double depamt3 = (((depamt2 * inrate) + bal2) + depamt2);
            
            System.out.println("Your new balance is " + depamt3);
            System.out.println("Press any key to exit...");
            }
            
        }else if (action == 'W'){
            
            Double withamt;
            
            
             System.out.print("Enter withdrawal amount: ");
                withamt = scan.nextDouble();
                
            if (withamt > bal2) {
                 System.out.println("Insufficient Balance");
             }else {
             
             Double bal3 = (bal2 - withamt);
            
             System.out.println("Your new balance is " + bal3);
             System.out.println("Press any key to exit...");
             }
              }else {
                System.out.println("You cancel your transaction. THANK YOU");
        }
        
        } else  {
            System.out.print("Your PIN code is incorrect. Please create an account and try again. Thanks!");
        }
        
       
       
    }
}