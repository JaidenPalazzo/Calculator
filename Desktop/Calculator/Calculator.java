import java.util.Scanner; 

public class Calculator{ 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); 

         //ask user for first number
         System.out.print("Please enter a number: ");
         int n = scanner.nextInt(); 

         //ask user for second number
         System.out.print("Please enter another number: ");
         int n2 = scanner.nextInt(); 

         //add numbers 
         int sum = n + n2; 

         //print results
         System.out.println("Sum of Numbers: " + sum); 

         //close scanner
         scanner.close(); 



    }
}