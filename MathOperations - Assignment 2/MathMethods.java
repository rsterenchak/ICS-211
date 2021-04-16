/**
 * The following class is used to create the desired output for the 
 * UsingMath.java driver class variables and print statements. The class   
 * achieves this by utilizing the MathOperations.java interface and implementing  
 * the interface into its' code.  
 *
 * @author     Sterenchak, Robert
 * @assignment ICS 211 MathOperations - Assignment 2
 * @date       January 29, 2019
 *
 */
public class MathMethods implements MathOperations{

   /** Constructor variables*/
   private double dNum = 0.0;
   private double dNum1 = 0.0;
   private double dNum2 = 0.0;
   private int iNum = 0;
   private boolean iNum1 = false;
   private double output1 = 0.0;
   private double output2 = 0.0;
   
    /** Add method for double variables*/
   public double add(double dNum1, double dNum2){
      output1 = (dNum1 +dNum2);
      //@return_value will output the addition of two double variables
      return this.output1;
   }
    /** Absolute value method for double variable*/
   public double absoluteValue (double dNum){
      output2 = Math.abs(dNum);
      //@return_value will output the absolute value of one of the double variables
      return this.output2;
   }
    /** IsEven method for integer variable*/
   public boolean isEven(int iNum){
     //if statement checks if iNum variable is divisible by 2 to determine output  
      if (iNum % 2 == 0){
         iNum1 = true;
         //@return_value will output "true" if integer is even
         return this.iNum1;
      }
      //else statement outputs false when number is determined to be odd
      else {
         iNum1 = false;
         //@return_value will output "false" if integer is odd
         return this.iNum1;
      }   
   }
}//ends class