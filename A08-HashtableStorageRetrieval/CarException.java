/**
 * PException --- program for the purpose of throwing an exception when certain parameters are met
 * according to the Person.java class. 
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A08-HashtableStorageRetrieval
 * @date       February 4, 2019
 */
public class CarException extends Exception{
   private String message;
   
   /** 
    * Constructs exception. 
    */
   public CarException(){
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