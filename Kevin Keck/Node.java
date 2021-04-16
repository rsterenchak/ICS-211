/**
 * @author  Kevin Keck
 */

public class Node implements Comparable {

   private Person person = null;
   private Node next = null;

   public Node(Person newPerson) {
      this.setPerson(newPerson);
      this.next = null;
   }

   public Node(Person newPerson, Node next) {
      this.setPerson(newPerson);
      this.next = next;
   }

   public int compareTo(Object o) {
      Node n = (Node) o;
      return this.getPerson().compareTo(((Node) n).getPerson());
   }

   public Node getNext() {
      return this.next;
   }

   public Person getPerson() {
      return this.person;
   }

   public void setNext(Node next) {
      this.next = next;
   }

   public void setPerson(Person newPerson) {
      this.person = newPerson;
   }

   @Override
   public String toString() {
      String output = this.getPerson().toString();
      return output;
   }
}