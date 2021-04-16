/**
 * BCException --- program for the purpose of throwing an exception when certain parameters are met
 * according to the BankCustomer.java class. 
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment:
 * @date       January 13, 2019
 */
public class BCException extends Exception{
   private String message;
   
   /** 
    * Constructs exception. 
    */
   public BCException(){
      //empty constructor
   }
   /**  
    * Corresponds to mutator method. 
    */
   public void setMessage(String newMessage){
      this.message =newMessage;
   }
   /**  
    * Corresponds to accessor method.
    */
   public String getMessage(){
      return this.message;
   }
}