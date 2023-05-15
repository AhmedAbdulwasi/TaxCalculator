import java.util.Scanner; // Import the Scanner class

public class App {
    public static void main(String[] args) {
    // Simple Tax Calculator that uses Federal and provincial tax to calculate your taxes annually.
        
    // Create a scanner for keyboard inputs
        Scanner keyboard = new Scanner(System.in);
    // Declare double variables for all key values
        double ftax,ptax,taxcost,salary,netpay,other_income;
    
        System.out.println("Please Enter your annual salary: ");
        salary = keyboard.nextDouble();

        System.out.println("Any Other Income?: ");
        other_income = keyboard.nextDouble();

        salary += other_income;
        // Calculating the federal income tax bracket
        if (salary > 221708){  //Using TurboTax income tax brackets
            ftax = 0.3300;
        }
        else if (salary >= 155626 && salary <= 221708) {
            ftax = 0.2900;
        }
        else if ( salary >= 97069 && salary <= 155625) {
            ftax = 0.2600;
        }
        else if ( salary >= 48535 && salary <= 97068) {
            ftax = 0.2050;
        }
        else if ( salary <= 48534) {
            ftax = 0.1500;
        }
        else {
            System.out.println("Invalid Input");   //If the user inputs a negative number
            keyboard.close();
            return;
        }
        // Calculating the provincial income tax bracket
        if (salary > 220000) { // Again, using TurboTax income tax bracekts
            ptax = 0.1316;
        }
        else if ( salary >= 150000 && salary <= 220000) {
            ptax = 0.1216;
        }
        else if (salary >= 92455 && salary <= 149999) {
            ptax = 0.1116;
        }
        else if ( salary >= 46227 && salary <= 92454) {
            ptax = 0.0915;
        }
        else if ( salary <= 46226) {
            ptax = 0.0505;
        }
        else {
            System.out.println("Invalid Input");   //If the user inputs a negative number  
            keyboard.close();
            return;
        }

        // Calculating tax cost
        taxcost = salary * (ftax + ptax);
        // Calculating net pay
        netpay = salary - taxcost;
        
        // Printing out the results
        System.out.println("Your Total Tax Cost is: " + taxcost);
        System.out.println("Your Net Pay is: " + netpay);
        keyboard.close();
  }

}
