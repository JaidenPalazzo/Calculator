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

         //ask user subtraction vs addition 
         System.out.print("Would you like to subtract or add these numbers? "); 
         String answer = scanner.next(); 

         int output = 0; 

         if(answer.equals("add")){
            //add numbers 
            output = n + n2; 
         }
         else{
            //subtract numbers 
            output = n - n2; 
         }

         //print results
         System.out.println("Result: " + output); 

         //close scanner
         scanner.close(); 



    }
}