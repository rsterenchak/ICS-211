/**
 * The following driver class stores an ArrayList of BankCustomers, 
 * while preventing duplicate inputs, invalid input, and as well as outputting a text 
 * document stored in the same folder as your .java files.
 * @author     Sterenchak, Robert
 * @assignment ICS 211 Bank(Driver class)
 * @date       January 16, 2019
 *
 */
//"java.util" utilized to allow Scanner class input. 
import java.util.*;
import java.io.*; 
public class Bank{
   public static void main(String[] args) throws Exception{
      Scanner sc = new Scanner(System.in);
      //"BankCustomer" initial name variable.
      String name="reddit";
      //"BankCustomer" initial account number variable.
      int acctNum=10001;
      Integer nObj= new Integer(acctNum);
      //"BankCustomer" initial account balance variable.
      double acctBal=100.0;
      Double bObj=new Double(acctBal);
      //"BankCustomer" initial variable.
      BankCustomer account = new BankCustomer(10001,100.0,"reddit");
      //"BankCustomer" acct declared ArrayList.
      ArrayList<BankCustomer> acct = new ArrayList<BankCustomer>();
   
      int remove = 0;
      int entry =0;
      //File declaration variables required to write and output the .txt file.
      File bankc= new File("BankReport.txt");
      FileWriter fw = new FileWriter(bankc);
      PrintWriter pw = new PrintWriter(fw);
      
      int count = 0;
      int input = 0;
      
      //Initial welcome message to the user.
      System.out.println("The purpose of this program is to enter banking information for new enrollees.");
      int j = 0;
      while (j==0) {
         try{
         
            //User prompt, "try/catch" utilized.
            System.out.println("Press any number key from 1 to 9 then press enter.");
            entry = sc.nextInt(); 
            if(entry <=9 && entry >=1){
               //User prompt to enter the main menu,"try/catch" utilized.
               System.out.println("Hello customer, Welcome to Hawaii Life banking!\nPress 1 to continue to the main menu.");
               input = sc.nextInt();
            
               j++;
            
            }
            //User selection declared invalid when not inside bounds of required input to proceed.  
            else if (entry != 1){
               System.out.print("Your selection is invalid.\n");
               entry = sc.nextInt();  
            }
         
         }
         //Catch statement for Exception ine.
         catch(InputMismatchException ine){
            System.out.print("Your selection is invalid.\n");
            sc = new Scanner(System.in);  
         }  
      
      }
      //While loop implemented to iterate through menu code as well as variously nested if statements.             
      while (input!=4 && (input>=1 ||input>=3 )&& count<=acct.size()) {
      
         try{
         
            System.out.println("1. Add a bank customer");
            System.out.println("2. Remove a bank customer");
            System.out.println("3. Print all bank customers");
            System.out.println("4. Exit");
            input = sc.nextInt();
            //Menu selection for adding a customer to an the BankCustomer arraylist.
            if (input == 1){
            
               System.out.println("You pressed 1.");
               boolean duplicatedAccount = false;
               //Do while loop implemented to prevent duplicate account numbers from being stored.
               do {
                  duplicatedAccount = false;
                  System.out.println("Input Customer Account Number (Must be 5 digits long):");
                  acctNum=sc.nextInt();
               
                  for(BankCustomer bc : acct) {
                     if (bc.getAcctNumber()==acctNum){
                        duplicatedAccount = true;
                     
                     }
                  }
               }
               while(duplicatedAccount);
               
               System.out.println("Input Customer Account Balance (Minimum $100.00):"); 
               acctBal=sc.nextDouble(); 
               sc = new Scanner(System.in);
               System.out.println("Input Customer Name (Must be at least 5 letters long):");
               name=sc.nextLine();
            
               int test = 0;
               while(test < acct.size() && acct.get(test).getAcctNumber() < acctNum)
               {
                  test++;
               }
            
               if(test <= acct.size() && !acct.contains(nObj)){
                  acct.add(test, new BankCustomer(acctNum, acctBal, name));
               }         System.out.println("Accounts stored = " + acct.size());
            }
            //Menu selection for removing a customer per his or her position within the ArrayList.
            if (input == 2) {
               System.out.println("You pressed 2.");
               System.out.println("Accounts stored = " + acct.size());
                if (acct.size() > 0){
                  for(int i = 0; i < acct.size(); i++)
                  {
                     System.out.print(acct.get(i).getAcctNumber());
                     System.out.println("----> " + (i +1));
                  }
               }
               System.out.println("Please choose an account from 1 to " + acct.size());
                                     
               if (acct.size() > 0){
                  int r=sc.nextInt();
                  acct.remove(r-1);
               }
               else{
                  System.out.println("There are currently no bank customers stored in this database.");
               }
            }
            //Menu selection for printing the current BankCustomer ArrayList.
            if(input == 3) {
               System.out.println("You pressed 3.");
               
               if (acct.size() > 0){
                  for(int i = 0; i < acct.size(); i++)
                  {
                     System.out.println(acct.get(i).getAcctNumber());
                  }
               }//Menu selection for exiting the program as well as creating the BankReport.txt file.
               else {
                  System.out.println("There are currently no bank customers stored in this database.");
               }
               
            }
            //Menu selection for exiting the program as well as creating the BankReport.txt file.
            if(input == 4) {
               System.out.println("Goodbye...Your inputs will be printed into a text document for administrative purposes.");
               pw.println(acct); 
               break;
               
            }
            //Statement to be used for prompting the user when he or she gives a bad input. 
            else if (input>4&&input<1){
            
               System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
               input = sc.nextInt();  
               throw new BCException();  
            }
         }
         //Catch statements declared to ensure correct input during user prompts for information. 
         catch(InputMismatchException ine){
            System.out.print("Your selection is invalid.\n");
            sc = new Scanner(System.in);
         }
         catch (BCException mse){
         }
      }
      count++;
      pw.close();
         
                     
         
   }     
}
