/**
 * This class recieves input from the user of Patient information.
 * These patients are then placed into a Priority Queue/ Heap. 
 * According to the menu options layed out within this class. The user may add patients,
 * remove patients, print Queue, or empty Queue.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A07 - Priority Queue  
 * @date       April 24, 2019
 */
import java.util.*;
public class EmergencyRoom{
   public static void main(String arg[ ])throws Exception{
     
      //Declared Array utilizing Heap "PQ" class     
      PQ arr = new PQ();
      Scanner sc = new Scanner(System.in);
      String name = "";
      String comment = " ";
      int Id= 0;
      int input = 0;
      int repeatInput = 1;
      char select= ('y');
      Person p = new Person ("first","comment", 0);
      int index = 0;
      
      
      //Mainly utilized while loops for this menu implementation.
      while(repeatInput==1){
      
         repeatInput = 0;
         while(repeatInput!=1){
            try{
            
               System.out.println("");
               System.out.println("Please choose from one of the following menu options:\n");
            
               System.out.println("1. Add a Patient\n\n2. Serve a Patient\n");
               System.out.println("3. Print all Patients\n\n4. Empty the Queue\n\n5. End the Process");
               System.out.println("\nThis program will continue running if none of the options are chosen...");
               input= sc.nextInt();
               
            //Menu option to (ADD) patients.
               if(input==1){
                  System.out.println("\n\nThe purpose of this menu option is to allow the user...which is you...to add"); 
                  System.out.println(" as many (PATIENTS) as needed, as well as their current condition/ symptoms.");
               
                  repeatInput = 1;
                  while(repeatInput==1){
                  
                     sc = new Scanner(System.in);
                     System.out.println("");
                  
                     System.out.println("Please input the individual's name. Must be more than 3 characters.");
                     name = sc.nextLine();
                  
                     System.out.println("Input specified Priority Level.");
                     System.out.println("Please choose from a Priority number betwen 0 and 5.\nLowest being 0 and Highest being 5.");   
                     Id=sc.nextInt();
                  
                     System.out.println("Describe the individual's current condition/symptoms.");
                     sc = new Scanner(System.in);
                     comment = sc.nextLine();
                     
                     p = new Person(name, comment, Id);
                     
                     //Method call for adding elements to Array Priority Queue.
                     arr.addElement(p);
                     arr.size();
                     index++;
                  
                  
                     System.out.print("Press 1 to input another Patient or 0 to return to the main menu.\n\n");
                     repeatInput = sc.nextInt();
                  }   
               
               
               }
               
               
               //Menu option to serve(REMOVE) patient.
               if(input==2){
                 repeatInput = 1;                         
                //if(repeatInput == 1){
                  
                           //while((select== ('Y')||select== ('y')) && (repeatInput == 1)){
                           while(repeatInput == 1){
                           
                           System.out.print("\n\nWould you like to serve the next Patient in line?");
                           System.out.println("Y or N");
                           sc = new Scanner(System.in);
                           select = sc.next().charAt(0);
                           
                           
                           if(select== ('N')||select== ('n')){ 
                           //exits to menu
                           repeatInput = 0;
                           
                           }
                           
                           if(select== ('Y')||select== ('y')){
                           
                           //calls removeElement method
                           arr.removeElement();                      
                           index--;
                           }
                           }                           
                           //}
    
               }
               
            
            
            //Menu option to (PRINT) patient list.
               if(input==3){
               repeatInput = 1;
               while(repeatInput == 1){
               arr.printQueue();
               repeatInput = 0;
               System.out.print("Press 1 to Print the Patient List again or 0 to return to the Main Menu.\n\n");
               repeatInput = sc.nextInt(); 
               }

               }
               
               
            //Menu option to (DELETE) entire patient list.
               if(input==4){
               arr.deleteQueue();   
               }
            
            
            //Menu option to (END) program.
               if(input==5){
                  System.exit(0);
               }
               
            }//end of TRY statement for entire MENU.
            
            
            
            //CATCHES
            //Used multiple exception catches to avoid all possible code crashes.
            catch (InputMismatchException ex){
               System.out.println("\nYour input was incorrect. Please try again.");
               sc = new Scanner(System.in); 
            }
            catch (NullPointerException ex){
               System.out.println("\nYour input was incorrect. Please try again.");
               sc = new Scanner(System.in); 
            }
            
            catch (PException pe){
               System.out.println("\nYour input was incorrect. Please try again.");
               sc = new Scanner(System.in); 
            }
            
             
         }
      }
      }
         
      }
