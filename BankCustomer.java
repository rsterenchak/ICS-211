/**
 * BankCustomer --- program to properly validate input of BankCustomer Object while inputtting
 * into an ArrayList.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment
 * @date       January 13, 2019
 */
public class BankCustomer {

  /** Constructor */
   private int acctNumber= 0; 
   private double balance= 0;
   private String name= "";
   

   public BankCustomer(int acctNumber, double balance, String name) throws Exception{
    //Uses "set" to enable method call for mutator methods.
      this.setAcctNumber(acctNumber);
      this.setBalance(balance);
      this.setName(name);
   }
   
   
   public void setAcctNumber(int newAcctNumber) throws Exception{
    //Verifies corresponding paramaters in the case of a valid "newAcctNumber" input.
      if ((newAcctNumber>=10001)&&(newAcctNumber<=99999)){
         this.acctNumber = newAcctNumber;
      }
      //Set corresponding parameters in both possible invalid "newAcctNumber" inputs.
      else {
      //Exception is thrown and the message specific to the ">=10001" parameter will be displayed.
         if (newAcctNumber<10001){
            BCException mse = new BCException();
            mse.setMessage("Error: Account Number "+ newAcctNumber +" is invalid, ensure this number is between 10,001 and 99,999.");
            throw mse;
         }
         //Exception is thrown and the message specific to the "<=99999" parameter will be displayed.
         else if (newAcctNumber>99999) {
            BCException mse = new BCException();
            mse.setMessage("Error: Account Number "+ newAcctNumber +" is invalid, ensure this number is between 10,001 and 99,999.");
            throw mse;
         } 
      }
   }
   
   public void setBalance(double newBalance) throws Exception{
    //Verifies corresponding paramaters in the case of a valid "newBalance" input.
      if ((newBalance>=100.0)){
         this.balance = newBalance;
      }
      //Set corresponding parameters in both possible invalid "newBalance" inputs.
      else {
      //Exception is thrown and the message specific to the "<100.0" parameter will be displayed.
         if (newBalance<100.0){
            BCException mse = new BCException();
            mse.setMessage("Error: Balance "+ newBalance +" input is invalid, ensure balance is at least 100.");
            throw mse;
         }
      }
   }
   
   public void setName(String newName) throws Exception{
      //The "newName" inputted variable is "trimmed" of any blank spaces contained.
      newName = newName.trim();
      //The length variable is declared and then used to check "newName" length.
      int length = 0;
      length = newName.length();
   //Verifies corresponding paramaters in the case of a valid "name" variable input.   
      if (length>=5){
         this.name = newName;   
      }
      //Exception is thrown in the event "name" variable input is less than 5 characters long.   
      else {
         if (length<5){
            BCException mse = new BCException();
            mse.setMessage("Error: Name cannot be less than 5 characters long.");
            throw mse;
         }   
      }
   
   }
  /** Accessor Methods */
   public int getAcctNumber() {
      return this.acctNumber;
   }

   public double getBalance() {
      return this.balance;
   }
   
   public String getName() {
      return this.name;
   }  
   public String toString() {
   
   
      String output = "";
      output = "Account Number: " + this.acctNumber;
      output = output + "\nBalance: " + this.balance;
      output = output + "\nName: " + this.name;
   
      return output;
   
   }

}