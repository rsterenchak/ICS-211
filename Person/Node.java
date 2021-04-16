/*
 * This class is responsible for the creation of nodes specific
 * to utilizing my Person.java and its compareTo method by implementing 
 * Comparable.
 *
 * @author: Blanca Polo
 * @student: Robert Sterenchak// edited by
 * @assignment ICS 211 Assignment: A04-Sorted-LinkedList-of Person  
 * @date       February 21, 2019
 */
 
public class Node implements Comparable{
	//instance variables
   
   private Person person = null;
   private Node next = null;
	
	/** Constructors */
   public Node(Person p){
      this.setPerson(p);
      this.next = null;
   }
	
   public Node(Person p, Node next){
      this.setPerson(p);
      this.next = next;
   }
	
   /** Accessor Methods */
   public Node getNext(){
      return this.next;
   }
	
   public Person getPerson(){
      return this.person;
   }
	/** Mutator Methods */
   public void setNext(Node next){
      this.next = next;
   }
   
  //if needed validations in here
   public void setPerson (Person newPerson){
      this.person = newPerson;  
   } 
   /** toString Method */
   public String toString( ){
      String s = this.getPerson( ).toString( );
      return s;
   }
      
         /** compareTo Method */  
   public int compareTo(Object o){
      Node toCompare = (Node)o;
      return this.getPerson().compareTo(((Node) toCompare).getPerson());
      //return 0;
      
   }
}






