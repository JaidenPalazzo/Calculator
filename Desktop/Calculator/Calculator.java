import java.util.Scanner; 

public class Calculator{ 
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); 

         //ask user for first number
         System.out.print("Please enter a number: ");
         float n = scanner.nextFloat(); 

         //ask user for second number
         System.out.print("Please enter another number: ");
         float n2 = scanner.nextFloat(); 

         //ask user subtraction vs addition 
         System.out.print("Would you like to multiply, divide, add, or subtract these numbers? "); 
         String answer = scanner.next(); 

         float output = 0; 

         if (answer.equals("multiply")){
            //multiply numbers 
            output = n * n2; 
         }

         else if(answer.equals("divide")){
            //add numbers 
            output = n / n2; 
         }

         else if(answer.equals("add")){
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