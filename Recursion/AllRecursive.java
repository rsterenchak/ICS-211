/**
 * The following program calculates three different mathematical computations utilizing  
 * recursive methods instead of for, while, or do loops. The mathematical computations
 * accomplished by this program are raising a number by the desired power, "factorial" computation,
 * and the calculation of adding numbers from one to the number designated by the user, and can be
 * defined as "summation."
 *
 * @author     Sterenchak, Robert
 * @assignment ICS 211 AllRecursive
 * @date       March 09, 2019
 *
 */
//"java.util" utilized to allow Scanner class input. 
import java.util.*;
public class AllRecursive{
   public static void main(String[] args) throws Exception{
      Scanner input = new Scanner(System.in);
      int x = 0;
      int y = 0;
      int n = 0;
      int sum = 0;
      int m = 4;
      int ans4 = 0;
         //Responsible for displaying initial message.
      ans4 = recMenu(m);    
   }        
      //Power recursive "method"  
   public static int power(int x, int y){
      if(y==0){
         x = 1;
         return x;
      }         
      return x * power(x, y-1);
   }
      //Factorial recursive "method"  
   public static int factorial(int x){
      if(x==0){
         x = 1;
         return x;
      }
      return x * factorial(x-1);
   }    
    
     //Summation recursive "method"  
   public static int summation(int n){
      if(n==0){
         return 0;
      }
      int sum = n;
      sum = sum + summation(n-1);
      return sum;
         
   }

    //Menu recursive "method"
   public static int recMenu(int m) throws Exception{
      Scanner input = new Scanner(System.in);
      int x = 0;
      int y = 0;
      int n = 0;
      int sum = 0;
      int ans4 = 0;
      
      //"Try/catch" implemented to handle incorrect input to include incapable computation.
      try{
         if (m>=4 || m<0){
         
            System.out.println("Choose from one of the following menu options:\n");
            System.out.println("1. Power (int,int); // two non-negative intgers\n");
            System.out.println("2. Factorial (int); // non-negative integer\n");
            System.out.println("3. Summation (int); // positive integer\n");
            System.out.println("0. Exit");
          
            m = input.nextInt();
            return recMenu(m);
         }
      //Menu option 1 utilizing Power Recursive method. 
         if (m==1){
            System.out.println("You've chosen menu option "+ m + ".");
            System.out.print("\nPlease input a positive number: ");
            x= input.nextInt();
            
         //Ensures numbers inputted by user are non-negative integers. 
            if ((x >=0) && (y >= 0)){
               System.out.print("\nWhat power would you like this number raised by?: ");
               y= input.nextInt();
               int ans1 = power(x,y);
               if ((ans1 < 0) || (( (x > 0) && (y > 0) ) && (ans1 == 0))){
                  System.out.println("Unable to compute correct solution. Please try again.");
                  m = 1;
                  return recMenu(m);
               }
               System.out.println("Result: " + x + " raised by the " + y +" power is "+ "(" + ans1 + ")");
               m = 4;
               return recMenu(m);
            }
            
            //Displays message and prompts user to "try again"
            else{
               System.out.println("The number you inputted is incorrect. Please try again."); 
               m = 1;
               return recMenu(m);
            }
         }
      //Menu option 2 utilizing Factorial Recursive method
         if (m==2){
            System.out.println("You've chosen menu option "+ m + ".");
            System.out.print("\nPlease input a positive number between 0 and 12 inclusive: ");
            x= input.nextInt();
         
         //Ensures variable input "x" is a positive number between 0 and 12 inclusive.
            if ((x >= 0) && (x <= 12)){      
               int ans2 = factorial(x);
               System.out.println("\nResult: The multiplication of values from 0 to "+ x + " is "+ "(" + ans2 + ")\n");
               m = 4;
               return recMenu(m);
            }
            else{
               System.out.println("Your input was incorrect. Please try again."); 
               m = 2;
               return recMenu(m);
            }
         }
      //Menu option 3 utilizing Summation Recursive method.
         if (m==3){
            System.out.println("You've chosen menu option "+ m + ".");
            System.out.print("\nPlease input a positive number: ");
            n= input.nextInt();
         //Ensures variable input "n" will be a positive number.   
            if (n >= 0){   
               int ans3 = summation(n);   
               System.out.println("\nResult: The sum of values from 1 to "+ n + " is "+ "(" + ans3 + ")\n");
               m = 4;
               return recMenu(m);
            }
            //Notifies user of incorrect input.
            else{
               System.out.println("Your input was incorrect. Please try again."); 
               m = 3;
               return recMenu(m);
            }
         }
      //Menu option 0 allows the user to exit from the Main menu and terminate the program.      
         if (m == 0){
            System.out.print("Goodbye...");
            System.exit(0);        
         }
      
      }
      //Displays message and handles caught exception regarding incorrect input.
      catch (InputMismatchException ex){
         System.out.println("\nYour input was incorrect. Please try again.");
         ans4 = recMenu(m);
      }
      //Displays message and handles caught exception regarding incapable computation.
      catch (StackOverflowError se){
         System.out.println("The result is out of bounds for computation. Please try again.");
         ans4 = recMenu(m);
      }
      //Recursive statement utilized in order to return to desired base case for the method.
      return recMenu(m); 
   }
             
}
