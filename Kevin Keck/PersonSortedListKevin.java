
/**
 * @author  Kevin Keck
 */

import java.io.*;

public class PersonSortedListKevin implements SortedListInterface {

   private static int count = 0;
   private int index = 0;

   private Node front = null;
   private Node back = null;
   private Node frontCursor = null;
   private Node backCursor = null;
   private Node floatingCursor = null;

   public boolean insertInOrder(Person newPerson) {

      Node newNode = new Node(newPerson);

      // adds the node if the list is empty
      if (count == 0) {
         front = newNode;
         back = newNode;
         count++;
         return true;
         // adds the node to the front of the list
      } else if (newNode.compareTo(front) < 0) {
         newNode.setNext(front);
         front = newNode;
         count++;
         return true;
         // adds the node to the end of the list
      } else if (newNode.compareTo(back) > 0) {
         back.setNext(newNode);
         back = back.getNext();
         count++;
         return true;
         // add the node to the appropriate sorted position
      } else {

         frontCursor = front;
         backCursor = frontCursor.getNext();

         while (newNode.compareTo(frontCursor) > 0) {

            if ((newNode.compareTo(frontCursor) > 0) && (newNode.compareTo(backCursor) < 0)) {
               frontCursor.setNext(newNode);
               floatingCursor = frontCursor.getNext();
               floatingCursor.setNext(backCursor);
               count++;
               return true;
            } else {
               frontCursor = backCursor;
               backCursor = frontCursor.getNext();
            }
         }
      }
      return false;
   }

   public boolean removeNode(Person newPerson) {

      Node newNode = new Node(newPerson);

      frontCursor = front;
      floatingCursor = frontCursor.getNext();
      backCursor = floatingCursor.getNext();

      // remove the node if it is first in the list
      if (newNode.compareTo(frontCursor) == 0) {
         front = front.getNext();
         count--;
         return true;
         // search list for existing node, remove if found *not working correctly*
      } else {
      
           
         //while (frontCursor!=null) {---Not necessary
         //while ((backCursor.getNext().compareTo(back) < 0)) {---Goes straight to return false;

            if (newNode.compareTo(backCursor) == 0) {
            
               //frontCursor.setNext(backCursor.getNext());//Questionable- maybe use
               floatingCursor.setNext(backCursor.getNext());//this one instead. 
               
               count--;
               return true;
            } else if (frontCursor.compareTo(backCursor) == 0) {
               return false;
            } else {
               frontCursor = backCursor;
               backCursor = frontCursor.getNext();
            }
            return false;

         //}---removed
      }
      //return false;---removed
   }

   // returns the current size of the list
   public int size() {
      return count;
   }

   // prints the formatted list to screen
   public void printList() {
      frontCursor = front;
      if (count == 0) {
         System.out.println("There are no items in the list");
      }
      for (int index = 0; index < count; index++) {
         System.out.println(frontCursor.toString());
         frontCursor = frontCursor.getNext();
      }

   }
}
