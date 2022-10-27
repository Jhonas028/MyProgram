import java.util.Scanner;
public class daysinamonth {
    public static void main(String[] args)
    {
   
   Scanner sc = new Scanner (System.in);
   
    System.out.println("Enter the specific month that you want know the number of days\n");
    System.out.print("Enter the month:");
    
    
    String month = sc.next();
    switch (month.toUpperCase()){
        case "JANUARY":
            System.out.print("31days");
        break;
       case "FEBRUARY":
            System.out.print("28days");
        break;
        case "MARCH":
            System.out.print("31days");
        break;
        case "APRIL":
            System.out.print("30days");
        break;
        case "MAY":
            System.out.print("31days");
        break;
        case "JUNE":
            System.out.print("30days");
        break;
        case "JULY":
            System.out.print("31days");
        break;
        case "AUGUST":
            System.out.print("31days");
        break;
        case "SEPTEMBER":
            System.out.print("30days");
        break;
        case "OCTOBER":
            System.out.print("31days");
        break;
        case "NOVEMBER":
            System.out.print("30days");
        break;
        case "DECEMBER":
            System.out.print("31days");
        break;
    default:
        System.out.println("Month not found, please try again with capital letter in the beginning");
            break;
        
    }
    
    
    
    
    
     
    }
}