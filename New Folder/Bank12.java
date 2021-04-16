/**
 *  
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
   
   String name="reddit";
   //String s = new String(name);
   
   int acctNum=10001;
   Integer nObj= new Integer(acctNum);
   
   //double acctBal=101.0;
   double acctBal=100.0;
   Double bObj=new Double(acctBal);
   
  ArrayList<BankCustomer> acct = new ArrayList<BankCustomer>();
   

   int remove = 0;
   int input = 0;
   int entry =0;
   System.out.println("The purpose of this program is to enter banking information for new enrollees.");
   
   while (entry!=1) {
      try{
      
   
      System.out.println("Press 1 to continue to the menu.");
      entry = sc.nextInt();  
   
      }
      
      catch(InputMismatchException ine){
      System.out.print("Your selection is invalid.\n");
      sc.nextLine();
      
      }
      }
      
      
      
      while (input!=4) {
      try{
      
      System.out.println("1. Add a bank customer");
      System.out.println("2. Remove a bank customer");
      System.out.println("3. Print all bank customers");
      System.out.println("4. Exit");
      input = sc.nextInt();
      
      if (input == 1){
       
       acct = new ArrayList<BankCustomer>();
         
        System.out.println("Your pressed 1.");
        System.out.println("Input Customer Account Number:");
        
        
        acctNum=sc.nextInt();
        nObj=new Integer(acctNum);
        
        System.out.println("Input Customer Account Balance:"); 
        
        acctBal=sc.nextDouble(); 
        bObj=new Double(acctBal);
        
 
        sc = new Scanner(System.in);
        System.out.println("Input Customer Name:");
        name=sc.nextLine();
         
        BankCustomer c1 = new BankCustomer(acctNum, acctBal, name);
         acct.add(c1);
         
        /*
        int test = 0;
        while (test < acct.size() && acct.get(test).getAcctNumber() < acctNum)
        
        {
         
            test++;
        }
        if(test < acct.size())
        {
            acct.add(test, new BankCustomer(acctNum, acctBal, name));
            }

              // account.add(test, new BankCustomer(acctNum, acctBal, name));
              
         */     
         
         
         
         
        
    }
    
    
    if (input == 2) {
        System.out.println("Your pressed 2.");
        System.out.println("Size= " + acct.size());
         int r=sc.nextInt();
         acct.remove(r-1);
    }
    if(input == 3) {
         System.out.println("Your pressed 3." + acct);
         System.out.println("Size= " + acct.size());
         /*
         for(int i = 0; i < acct.size(); i++)
         {
            System.out.println(acct.get(i).getAcctNumber());
         }
         */

    }
    if(input == 4) {
        System.out.println("Goodbye...");
        break; 
   }
   
   else if (input>4&&input<1){
        
        System.out.println("Enter \"1\", \"2\", \"3\" or \"4\"");
        input = sc.nextInt();  
        throw new BCException();  
   }
    
      
      }
      catch(InputMismatchException ine){
      System.out.print("Your selection is invalid.\n");
      sc.nextLine();
      }
      catch (BCException mse){
      
      
      }
      
      }
      
      }    


}

