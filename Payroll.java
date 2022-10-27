

public class Payroll {
    public static void main(String[] args) {
     
    String name = "Ocampo, Robert";
    Double wt = 0.15;
    Double sss = 0.0363;
    Double medc = 0.0125;
    Double love = 100.00;
    Double gpay = 25000.00;
    
    Double wt1 = (wt * gpay);
    Double sss1 = (sss * gpay);
    Double medc1 = (medc * gpay);
    Double netpay1 = (wt1 + sss1 +medc1 + love);
    Double netpay2 = (gpay - netpay1);
    
    
    
    
    System.out.println("Withholding Tax: " + wt);
    System.out.println("SSS Contribution: " + sss);
    System.out.println("Medicare: " + medc);
    System.out.println("Pag-IBIG: " + love + " \n");
    
    System.out.println("--------------------------------------\n");
    System.out.println("Employee Name: " + name);
    System.out.println("Gross Pay: " + gpay + "\n");
    System.out.println("--------------------------------------\n");
    
    System.out.println("Deductions                   Amount\n");
    System.out.println("Withholding Tax              " + wt1);
    System.out.println("SSS Contribution:            " + sss1);
    System.out.println("Medicare:                    " + medc1);
    System.out.println("Pagibig COntribution:        " + love);
    
    System.out.println("--------------------------------------\n");
    System.out.println("Net pay:                     " + netpay2);
    
    
    
       
    }
}