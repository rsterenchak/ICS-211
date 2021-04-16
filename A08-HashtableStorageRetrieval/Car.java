/**
 * This class verifies variable input according to pre-determined parameters from 
 * Professor Polo. This code ensures the proper output utilizing the toString, 
 * compareTo, Accessor, and Mutator methods while also implementing the comparable
 * interface.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A08-HashtableStorageRetrieval  
 * @date       April 24, 2019
 */
public class Car implements Comparable{

   private int year = 0; 
   private int serialNumber= 0;
   private String makeModel= "";
   
   /** Constructors */
   public Car(String makeModel, int year, int serialNumber) throws Exception{
    //Uses "set" to enable method call for mutator methods.
      this.setMakeModel(makeModel);
      this.setYear(year);
      this.setSerialNumber(serialNumber);
   }
   
   public Car(int serialNumber) throws Exception{
    //Uses "set" to enable method call for mutator methods.

      this.setSerialNumber(serialNumber);
   }
   /*
   public Person(int id, String name) throws Exception{
    //Uses "set" to enable method call for mutator methods.
      this.setId(id);
      this.setName(name);
   }
   */
   
   /** Accessor Methods */
   public String getMakeModel() {
      return this.makeModel;
   }

   public int getYear() {
      return this.year;
   }
   
   public int getSerialNumber() {
      return this.serialNumber;
   }
   
   public void setMakeModel(String newMakeModel) throws Exception{
      //The "newName" inputted variable is "trimmed" of any blank spaces contained.
      newMakeModel = newMakeModel.trim();
      //The length variable is declared and then used to check "newName" length.
      int length = 0;
      length = newMakeModel.length();
   //Verifies corresponding paramaters in the case of a valid "name" variable input.   
      if (length>=5){
         this.makeModel = newMakeModel;   
      }
      //Exception is thrown in the event "name" variable input is less than 3 characters long.   
      else {
         if (length<5){
            CarException ce = new CarException();
            ce.setMessage("Error: Name cannot be less than 3 characters long.");
            throw ce;
         }   
      
      }
   
   }  
  
   public void setYear(int newYear) throws Exception{
    //Verifies corresponding paramaters in the case of a valid "newId" input.
      if ((newYear>=1970)&&(newYear<=2019)){
         this.year = newYear;
      }
      //Set corresponding parameters in both possible invalid "newId" inputs.
      else {
      //Exception is thrown and the message specific to the ">=101" parameter will be displayed.
         if (newYear<1970){
            CarException ce = new CarException();
            ce.setMessage("Id number is not in range: 100 to 999.");
            throw ce;
         }
         //Exception is thrown and the message specific to the "<=999" parameter will be displayed.
         else if (newYear>2019) {
            CarException ce = new CarException();
            ce.setMessage("Id number is not in range: 100 to 999.");
            throw ce;
         } 
      }
   }
   
 
   
     
   public void setSerialNumber(int newSerialNumber) throws Exception{
    //Verifies corresponding paramaters in the case of a valid "newId" input.
      if ((newSerialNumber>0)&&(newSerialNumber<99999)){
         this.serialNumber = newSerialNumber;
      }
      //Set corresponding parameters in both possible invalid "newId" inputs.
      else {
      //Exception is thrown and the message specific to the ">=101" parameter will be displayed.
         if (newSerialNumber<=0){
            CarException ce = new CarException();
            ce.setMessage("Id number is not in range: 0 to 99999.");
            throw ce;
         }
         //Exception is thrown and the message specific to the "<=999" parameter will be displayed.
         else if (newSerialNumber>=99999) {
            CarException ce = new CarException();
            ce.setMessage("Id number is not in range: 0 to 99999.");
            throw ce;
         } 
      }
   }
   
   
   /** toString Method */  
   public String toString() {
   
      String output = "";
      output = "\nMake/Model: " + this.makeModel;
      output = output + "\nYear: " + this.year;
      output = output + "\nSerial Number: " + this.serialNumber;
      output = output + "\n";
      return output;
   
   }
   
   /** compareTo Method */  
   public int compareTo(Object o){
      
      Car oneCar = (Car) o;
      if(this.getSerialNumber() < oneCar.getSerialNumber())
         return -1;
      if(this.getSerialNumber() > oneCar.getSerialNumber())
         return 1;
        
      return 0;
   }
   
}
