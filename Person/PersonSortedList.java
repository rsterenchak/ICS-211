/**
 * This class is responsible for correctly adding nodes into the LinkedList 
 * ascending according to certain parameters. In order to satisfy these
 * parameters the compareTo method is used to determine placement of nodes 
 * and detect whether or not duplicates exist within this List while at the
 * same time removing these duplicate nodes when enacted in the driver class.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A04-Sorted-LinkedList-of Person  
 * @date       February 21, 2019
 */
import java.util.*;
public class PersonSortedList implements SortedListInterface{

   private static int count = 0;
   private Node front = null;
   private Node back = null;
   private Node d = null;
   private Node c = null;
   private boolean s;
   private Node cursor= front;
   
   /**insertInOrder Method*/
   public boolean insertInOrder(Person p){
   
      //Begins creation of Linked List given that the size of list is 0.
      if(count == 0){
         Node newNode = new Node(p);
         front = newNode;
         back = newNode; 
         count++;
         return true;
      }
         
      Node cursor = front;
      
      /*
      * "While" loop ensures iteration through entirety of list by requiring loop
      * to continue as long as cursor is not "null", meaning as long as there are 
      * valid nodes to be compared.     
      */
      while(cursor != null){
         
         //Checks for duplicates by utilizing the compareTo method.
         if (cursor.compareTo(new Node(p)) == 0){
            return false;
         }
                
         //Iterates through nodes within LinkedList.
         cursor = cursor.getNext();  
      }
         
      if((front.compareTo(new Node(p))) == 1){
         
         //Adds node in location dependent upon ID value in comparison to the front node.
         Node newNode = new Node(p);
         newNode.setNext(front);
         front = newNode;
         count++;
     
         return true;
      }
         
        if((front.compareTo(new Node(p))) == -1){
         
         //Adds node in location dependent upon ID value in comparison to the front node.
         Node newNode = new Node(p);
         Node c = front;
         d = newNode;
         d.setNext(c.getNext());
         c.setNext(d);
         count++;
      
         return true; 
        }
      return true;
   }
   
   /**removeNode Method*/    
   public boolean removeNode(Person p){
      Node newNode = new Node(p);
      d = front;
      c = front;
      cursor = front;
      
      while(cursor != null){
          
         //Compares Person ID with Nodes currently stored in the Linked List.
         if ((newNode.compareTo(cursor))==0){     

            //Node c references value before the located duplicate.
            //Node c then changes "next" value reference to the value before
            //causing "duplicate" value in between to be dereferenced and 
            //picked up by the "Garbage collector".
            c.setNext(c.getNext().getNext());
            count--;
           return true;  
           
         }
         
         //References cursor to next Node when at the front of the LinkedList.
         if (cursor == front){
            cursor=cursor.getNext();
         }
         
         //References made to ensure that in the event there is a duplicate the middle node 
         //does not have any extra references.
         else{
            c=cursor;
            cursor=cursor.getNext();
         }
      }
    return false;     
   }
     
   public int size(){
      //Returns current list size.
      return count;
   
   }
   /**printList Method*/   
   public void printList( ){
      int version = 0;
      Node cursor = front;
   
         //Utilized "for" loop to iterate through LinkedList.     
         for(int i= 0; i<count;i++){
            System.out.println(cursor.toString());
            cursor= cursor.getNext();
      
         }
   
   }

}
