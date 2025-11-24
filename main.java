/* Write a for loop that prints: 1 2 … numVal

Ex: If the input is:

4

the output is:

1 2 3 4 */

import java.util.Scanner;

public class ForLoops {
   public static void main (String [] args) {
      int numVal;
      int i;
      int userNum;
      
      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();
      
      for (i = 1; i<= numVal; i++) {
         System.out.print(i + " ");
      }
/* Write code that prints: userNum … 2 1
Print a newline after each number.

Ex: If the input is:

3

the output is:

3
2
1
  */
     
      userNum = input.nextInt();
      
      for (i = userNum; i>=1;i--) {
         System.out.println(i);
      }

     
     
  

/* Write code that prints: Ready! firstNumber … 2 1 Run!
Your code should contain a for loop. Print a newline after each number and after each line of text.

Ex: If the input is:

3

the output is:

Ready!
3
2
1
Run! */

 int firstNumber;
     
      Scanner input = new Scanner(System.in);
      firstNumber = input.nextInt();
System.out.println("Ready!");
      for(i = firstNumber; i>=1; i--){
         System.out.println(i);
      }
System.out.println("Run!");
   
   }
}



     
      
      
 
