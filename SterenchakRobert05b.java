/**
 * The following is a program used to convert milliliters to US cups through user input.
 * This program takes into account incorrect inputs by utilizing try-catch and if-else statements
 * to ensure errors do not occur at run-time.
 *
 * @author     Sterenchak, Robert
 * @assignment ICS 111 Assignment 05
 * @date       September 30, 2018
 *
 */
//"java.util" utilized to allow Scanner class input.
import java.util.*;
public class SterenchakRobert05 {
  public static void main(String[] args) {
	double  hgtInches = 0.0;
	double  wgtPounds = 0.0;
	double  bmIndex = ((703 * wgtPounds)/(hgtInches * hgtInches));
   		
	Scanner reader = new Scanner(System.in);
	System.out.println("This program calculates your body mass index according to your current height and weight.");
	System.out.println("Enter your height in inches.");
	
	try {
		hgtInches = reader.nextDouble();
	if ( (hgtInches < 48) || (hgtInches > 80) ){
      			
	   System.out.println("Your input is incorrect. Please input a height between 48 and 80 inches.");
	}
	}
	catch (InputMismatchException ine){
      
		System.out.println("Your input is incorrect, please enter a number.");
	}
    
	System.out.println("Enter your weight in pounds.");
	try {
		wgtPounds = reader.nextDouble();
	if ( (wgtPounds < 75) || (wgtPounds > 300) ){
      			
	   System.out.println("Your input is incorrect. Please input a weight between 75 and 300 pounds.");
	}
	}
	catch (InputMismatchException ine){
      
		System.out.println("Your input is incorrect, please enter a number.");
	}
	System.out.println("BMI: " + bmIndex);
	if ((bmIndex > 25)){
	System.out.println("Your BMI is considered high.");
	}
	else {
		
    System.out.println("Your BMI is considered good.");	
	
	}
	}
}