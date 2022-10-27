import java.util.Scanner;

public class OldesttoYoungest {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        
        String result = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Jerome's Age: ");
        int jerome = scan.nextInt();
        
        System.out.print("Jacob's Age: ");
        int jacob = scan.nextInt();
        
        System.out.print("Matilda's Age: ");
        int matilda = scan.nextInt();
        
        if (jerome > jacob && jerome > matilda) result += "Jerome is the oldest. ";
        if (jacob > jerome && jacob > matilda) result += "Jacob is the oldest. ";
        if (matilda > jacob && matilda > jerome) result += "Matilda is the oldest. ";
        
        if (jerome < jacob && jerome < matilda) result += "Jerome is the youngest.";
        if (jacob < jerome && jacob < matilda) result += "Jacob is the youngest.";
        if (matilda < jacob && matilda < jerome) result += "Matilda is the youngest.";
        
        System.out.print(result);
    }
}