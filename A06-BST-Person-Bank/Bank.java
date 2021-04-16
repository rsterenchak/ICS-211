/**
 * This class verifies variable takes in user input and works concidedly with other classes 
 *  in order to order and verify all information for this Banking Simulation.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A06-BST-Person-Bank  
 * @date       April 6, 2019
 */
import java.util.*;
public class Bank{
   public static void main(String arg[ ])throws Exception{
     
      Scanner sc = new Scanner(System.in);
      String name = "";
      String comment = " ";
      int Id= 0;
      BNode root=null; 
      Person p = null;
      int key = Id;
      BankBST personList = new BankBST();
      
      int input = 0;
      int repeatInput = 1;
      
      char select= (' ');
      
      
      //Mainly utilized while loops for this menu implementation.
      while(repeatInput==1){
      
         repeatInput = 0;
         while(repeatInput==0){
            try{
               System.out.println("Hello the purpose of my existence is to Simulate a Bank...");
               System.out.println("Please choose from one of the following menu options:\n");
            
               System.out.println("1. Add a Bank Customer\n\n2. Update a Bank Customer\n");
               System.out.println("3. Print all Bank Customers\n\n4. Exit program");
               System.out.println("\nThis program will continue running if none of the options are chosen...");
               input= sc.nextInt();
            
            //Menu option to add Bank Customers.
               if(input==1){
                  System.out.println("\n\nThe purpose of this menu option is to allow the user...which is you...to add"); 
                  System.out.println("as many USERS as needed, as well as their specified charactersitics.");
               
                  repeatInput = 1;
                  while(repeatInput==1){
                  
                     sc = new Scanner(System.in);
                     System.out.println("");
                  
                     System.out.println("Please input the individual's name. Must be more than 3 characters.");
                     name = sc.nextLine();
                  
                     System.out.println("Please input his or her Identification number.");
                     System.out.println("Must be between and to include 101 and 999.");   
                     Id=sc.nextInt();
                  
                     System.out.println("Describe the individual.");
                     sc = new Scanner(System.in);
                     comment = sc.nextLine();
                  //This is where I implemented adding the Person objects in the BankBST
                     p = new Person(name, comment, Id);
                     key = p.getId();
                     personList.insertBNode(p);
                     System.out.println("\n"+p+"\n");
                  
                  
                     System.out.print("Press 1 to input another Bank Customer or 0 to return to the main menu.\n\n");
                     repeatInput = sc.nextInt();
                  }   
               
               
               }
               try{
                 if(input==2){
                 repeatInput =1;                         
                while(repeatInput ==1){
               //Menu option to update and change Bank Customers information.   
                  
                        
               
                           System.out.print("The following is a list of every Bank Customer currently stored in the system:\n\n");
                           // Display all individuals currently in the database to include ID
                           personList.printBSTree();
                           System.out.println("\n\nPlease select a bank customer according to ID.");
                           Id=sc.nextInt();
                        //returns customer according to ID.
                           personList.find(key, p);
                           System.out.println(p);
                        //utilized while loop and char input for asking whether the user would like to edit name or comment.        
                           while(select!= ('E')||select!= ('e')||select != ('0')|| repeatInput!=0){       
                              System.out.println("Press N to edit his name or C to edit the comment section.");
                              System.out.println("Press E to exit to main menu when desired.");
                                    sc = new Scanner(System.in);
                                    select = sc.next().charAt(0);
                           
                              if (select== ('N')||select== ('n')){
                                 
                                 System.out.println("Please input the Bank Customer's desired name change:");
                                 sc = new Scanner(System.in); 
                                 name = sc.nextLine();

                                 System.out.println(p);
                                 
                                 p = new Person (name, comment, Id);
                                 System.out.println(p);
                              }
                              if (select== ('C')||select== ('c')){
                                 System.out.println("Please input what you would like Bank Customer's comments to be changed to:");
                                 sc = new Scanner(System.in); 
                                 comment = sc.nextLine();    
                                 

                                 
                                 System.out.println(p);

                                 p = new Person (name, comment, Id);
                                 System.out.println(p);
                              }
                              if (select== ('E')||select== ('e')){
                              System.out.print("Press 1 to input another Bank Customer or 0 to return to the main menu.\n\n");
                              repeatInput = sc.nextInt();
                                 
                              }                           
                           }
                           }
                                               
                      
                     

                  
                  
                  
                  
               }
               }
               
               catch (NullPointerException ex){
                  System.out.println("\nThe user ID you entered was not found. Please try again.");
                  sc = new Scanner(System.in); 
               }
            
            
            
            
            //Menu option that prints all Bank Customers and their information currently stored.
               if(input==3){
                  personList.printBSTree();
                  if(root==null){
                     System.out.println("There are currently no USERS stored in the system yet. Please press 0 once to exit to the main menu.");
                     repeatInput = sc.nextInt();
                  }
               }
            
               if(input==4){
                  System.exit(0);
               }
            }
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
