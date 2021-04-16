/**
 * This class recieves input from the user of vehicle information.
 * These vehicles are then added into an Array consisting of linked Lists. 
 * According to the menu options layed out within this class. The user may add vehicles,
 * remove vehicles, view vehicles, print inventory, and print inventory to text file.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A08-HashtableStorageRetrieval  
 * @date       April 24, 2019
 */
import java.util.*;
public class CarSales{
   public static void main(String arg[ ])throws Exception{
     
      
      Scanner sc = new Scanner(System.in);     
      int size = 11;
      String makeModel = "Honda";
      int serialNumber =100;
      int year=1999;
      int input = 0;
      int repeatInput = 1;
      char select= ('y');
      Car c = new Car(makeModel, year, serialNumber);
      CarInventory vehArray = new CarInventory(size);
      int index = 0;
      
      //Mainly utilized while loops for this menu implementation.
      while(repeatInput==1){
      
         repeatInput = 0;
         while(repeatInput!=1){
            try{
            
               System.out.println("");
               System.out.println("Please choose from one of the following menu options:\n");
            
               System.out.println("1. Add a Car\n\n2. Search for a Car\n");
               System.out.println("3. Remove/sell a car\n\n4. Print inventory to screen\n\n5. Print Inventory to file\n");
               System.out.println("6. End this program.");
               System.out.println("\nThis program will continue running if none of the options are chosen...");
               input= sc.nextInt();
               
            //Menu option to (ADD A CAR).
               if(input==1){
                  System.out.println("\n\nThe purpose of this menu option is to allow the user...which is you...to add"); 
                  System.out.println(" as many (CARS) as needed, as well as their Make/Model, Year, and Serial Number.");
               
                  repeatInput = 1;
                  while(repeatInput==1){
                  
                     sc = new Scanner(System.in);
                     System.out.println("");
                  
                     System.out.println("Please input the vehicle's Make/Model. Must be more than 5 characters.");
                     makeModel = sc.nextLine();
                  
                     System.out.println("Input the vehicle's Year produced.");
                     System.out.println("Please choose a year between 1970 and 2019.\n");   
                     year = sc.nextInt();
                  
                     System.out.println("Input the vehicle's Serial Number.");
                     System.out.println("Please choose a number consisting of 5 digits between 0 and 99999.");
                     serialNumber = sc.nextInt();
                     
                     c = new Car(makeModel, year, serialNumber);
                     
                     //Method call for adding elements to Array/LinkedLists
                     vehArray.addCar(c);
                     vehArray.getNumberOfCars();
                     index++;
                  
                  
                     System.out.print("Press 1 to input another Patient or 0 to return to the main menu.\n\n");
                     repeatInput = sc.nextInt();
                  }   
               
               
               }
               if(input==2){
                     System.out.print("Press 1 to show inventory again or 0 to return to the main menu.\n\n");
                     repeatInput = sc.nextInt();   
               }
               
               //Menu option to (SEARCH FOR A CAR) Not working.
               /*
               if(input==2){
                 repeatInput = 1;                         
                           while(repeatInput == 1){
                           
                           System.out.print("\n\nWould you like to search for another vehicle?");
                           System.out.println("Y or N");
                           sc = new Scanner(System.in);
                           select = sc.next().charAt(0);
                           
                           
                           if(select== ('N')||select== ('n')){ 
                           //exits to menu
                           repeatInput = 0;
                           
                           }
                           
                           if(select== ('Y')||select== ('y')){
                           
                           //calls removeCar method
                           vehArray.removeCar();                      
                           index--;
                           }
                           }                           
                           
    
               }
               */
            
            
            //Menu option to (REMOVE/SELL) vehicle list.
               if(input==3){
               repeatInput = 1;
               while(repeatInput == 1){
               serialNumber = sc.nextInt();
               vehArray.removeCar(serialNumber);
               repeatInput = 0;
               System.out.print("Press 1 to Remove another Vehicle or 0 to return to the Main Menu.\n\n");
               repeatInput = sc.nextInt(); 
               }

               }
               
               
            //Menu option to (PRINT INVENTORY TO SCREEN) entire vehicle list.
               if(input==4){
                  
                  repeatInput = 1;
                  while(repeatInput==1){
                     vehArray.printInventory();
                     System.out.print("Press 1 to show inventory again or 0 to return to the main menu.\n\n");
                     repeatInput = sc.nextInt();
               }
            
            }
            //Menu option to (PRINT INVENTORY TO FILE) program. Not Working
               if(input==5){
                     System.out.print("Press 1 to show inventory again or 0 to return to the main menu.\n\n");
                     repeatInput = sc.nextInt();   
               }
            //Menu option to (END) program.   
               if(input==6){
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
            
            catch (CarException ce){
               System.out.println("\nYour input was incorrect. Please try again.");
               sc = new Scanner(System.in); 
            }
            
             
         }
      }
      }
         
      }
