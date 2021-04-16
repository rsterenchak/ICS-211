/**
 * This class verifies variable input according to pre-determined parameters from 
 * Professor Polo. This code ensures the proper output utilizing the toString, 
 * compareTo, Accessor, and Mutator methods while also implementing the comparable
 * interface.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A06-BST-Person-Bank  
 * @date       April 6, 2019
 */
public class Person implements Comparable{

   private int id = 0; 
   private String name="";
   private String comment= "";
   
   /** Constructors */
   public Person(String name, String comment, int id) throws Exception{
    //Uses "set" to enable method call for mutator methods.
      this.setId(id);
      this.setName(name);
      this.setComment(comment);
   }
   public Person(int id, String name) throws Exception{
    //Uses "set" to enable method call for mutator methods.
      this.setId(id);
      this.setName(name);
   }

   public void setId(int newId) throws Exception{
    //Verifies corresponding paramaters in the case of a valid "newId" input.
      if ((newId>=101)&&(newId<=999)){
         this.id = newId;
      }
      //Set corresponding parameters in both possible invalid "newId" inputs.
      else {
      //Exception is thrown and the message specific to the ">=101" parameter will be displayed.
         if (newId<101){
            PException pe = new PException();
            pe.setMessage("Id number is not in range: 100 to 999.");
            throw pe;
         }
         //Exception is thrown and the message specific to the "<=999" parameter will be displayed.
         else if (newId>999) {
            PException pe = new PException();
            pe.setMessage("Id number is not in range: 100 to 999.");
            throw pe;
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
      if (length>=3){
         this.name = newName;   
      }
      //Exception is thrown in the event "name" variable input is less than 3 characters long.   
      else {
         if (length<3){
            PException pe = new PException();
            pe.setMessage("Error: Name cannot be less than 3 characters long.");
            throw pe;
         }   
      
      }
   
   } 
   
     
   public void setComment(String newComment){
      //The length variable is declared and then used to check "newComment" length.
      int length = 0;
      length = newComment.length();
   //Verifies corresponding paramaters in the case of a valid "comment" variable input.   
      if (length>=1){
         this.comment = newComment;   
      }
      //In the event "comment" variable input is less than 1 character long or blank.   
      else {
         if (length<1){
            this.comment = "";            
         }   
      }
   }
   
  /** Accessor Methods */
   public int getId() {
      return this.id;
   }

   public String getName() {
      return this.name;
   }
   
   public String getComment() {
      return this.comment;
   }
   
   /** toString Method */  
   public String toString() {
   
      String output = "";
      output = "Person name: " + this.name;
      output = output + "\nID: " + this.id;
      output = output + "\ncomment: " + this.comment;
      output = output + "\n";
      return output;
   
   }
   
   /** compareTo Method */  
   public int compareTo(Object o){
      
      Person onePerson = (Person) o;
      if(this.getId() < onePerson.getId())
         return -1;
      if(this.getId() > onePerson.getId())
         return 1;
        
      return 0;
   }
   
}
