/**
 * PException --- program for the purpose of throwing an exception when certain parameters are met
 * according to the Person.java class. 
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A03-Person Object 
 * @date       February 4, 2019
 */
public class PException extends Exception{
   private String message;
   
   /** 
    * Constructs exception. 
    */
   public PException(){
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