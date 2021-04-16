/* @author Blanca Polo
 * This class guides the creation of a List that will
 * remain sorted in ascending order at all times.
 * This list will be 
 */
public interface SortedListInterface{
   
  /**
  * This method will a person as 
  * where it belongs in the list.
  * @param Person p to add into a Node
  * @return boolean true if the node was added
  *     false if the node was duplicated therefore not added
  */
   abstract boolean insertInOrder(Person p);
   
  /**
   * removes a given person from the list
   * it uses the compareTo method in Person to 
   * find the person and then it deletes it.
   * 
   */
   abstract boolean removeNode (Person p);
   
  /**
  * keeps a count of the amount of nodes in the list
  * @return int the number of nodes
  */
   abstract int size( );
   
   /**
   * this method prints the list in ascending order
   * @return void
   */

   abstract void printList( );

} //ends class


