import java.util.Scanner;

public class tenevennumbers {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int x = 1, y = 0;
        
        
      while (y < 10) {
          if (x % 2 == 0) {
              System.out.println(x);
              y++;
          } 
         x++;
      }
         
        
        
        
        
    }
}