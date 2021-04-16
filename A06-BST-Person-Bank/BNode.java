/**
 * This class verifies and allows Nodes to be arranged in a desired way 
 * so that this program will function accordingly while taking in
 * user inputted information in the form of Person objects.
 * 
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A06-BST-Person-Bank  
 * @date       April 6, 2019
 */
public class BNode {

   private Person person = null;
   public BNode lChild = null;
   public BNode rChild = null;
   public int key;
   
   
   /** Constructors */
   public BNode(BNode lChild, Person p, BNode rChild){
      this.lChild = lChild;
      this.setPerson(p);
      this.rChild = rChild;
   }
   /** Constructor created personally to allow for setting 'key' value. */
   public BNode(int key,Person p){
      this.lChild = null;
      this.setInt(key);
      this.setPerson(p);
      this.rChild = null;         
   }
   /** Accessor Person */
   public Person getPerson(){
      return this.person;
   }
   /** Mutator Person */
   private Person setPerson(Person newPerson){
      this.person = newPerson;
      return newPerson;
   }
  /** Mutator Person */ 
   private Integer setInt(Integer newInt){
      this.key = newInt;
      return newInt;
   }
   /** Accessor Left Child */
   public BNode getLChild(){
      return this.lChild;      
   }
   /** Accessor Right Child */
   public BNode getRChild(){
      return this.rChild;
   }
   /** Mutator Left Child */
   public void setLChild(BNode newLChild){
      this.lChild = newLChild;
   }
   /** Mutator Right Child */
   public void setRChild(BNode newRChild){
      this.rChild = newRChild;
   }
   /** toString to Print */
   public String toString(){
      String s = this.getPerson().toString();
      return s;
   }
}  

   

