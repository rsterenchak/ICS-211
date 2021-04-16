/**
 * This class recieves input from the user of vehicle information.
 * These vehicles are then added into an Array consisting of linked Lists. 
 * According to the menu options layed out within this class. The user may add vehicles,
 * remove vehicles, view vehicles, print inventory, and print inventory to text file.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A08-HashtableStorageRetrieval  
 * @date       April 24, 2019
 */
import java.io.*; 
import java.util.*;
public class CarInventory{
      
   private int tableSize = 11;
   private int serialNumber;
   private int size = tableSize;  
   private CarList c = new CarList ();
   private int hashValue = serialNumber%tableSize;
   private CarList vehArray [] =  new CarList [size];
   private String makeModel = "";
   private int year = 0;
   
   

/**CarInventory Method*/
public CarInventory(int size){

   for (int i = 0; i<size; i++){
      vehArray[i] = new CarList();

   }
}

/**AddCar Method*/
public void addCar(Car c){
   int serialNumber = c.getSerialNumber();
   int hashValue = serialNumber%tableSize;
   (vehArray[hashValue]).insertInOrder(c);
   System.out.println("Vehicle has been added to the inventory.\n");


}


public String viewCar(Car c){

   String status = "";
   int serialNumber = c.getSerialNumber();
   int hashValue = serialNumber%tableSize;

   boolean s  = (vehArray [hashValue]).viewNode(c);

   if(s==true){
      status = "VEHICLE STATUS: CURRENTLY IN STOCK";
      System.out.println(status);
      return status;
   }

   if(s==false){
      status = "VEHICLE STATUS: UNAVAILABLE";
      System.out.println(status);
      return status;
   }
   return status;
}


/**Remove Method "Not working"*/
public void removeCar(int serialNumber){
   int hashValue = serialNumber%tableSize;
   for(int i = hashValue; i < size; i++){

   (vehArray[i]).removeNode(serialNumber);

   }
   

}

/**PrintInventory Method*/
public void printInventory(){

   for(int i = 0; i < size; i++){

   (vehArray[i]).printList();
   
   }
}

/**Print to File Method*/
public void printToFile(){
       
       for(int i=0; i < size ; i++){
       
       }
    } 


/**GetNumberOfCars Method*/
public int getNumberOfCars(){
   int counter = 0;
   for(int i = 0; i < size; i++){
      
      (vehArray[i]).printCounter();
      
   }  
   (vehArray[size-1]).printCount();  
   return counter;
}

}


//-------------------------------------------------------------------------------------------------//
/**
 * This class recieves input fromt he CarInventory Class and organizes the information  
 * accordingly using the Node.java to set the individual Car Nodes.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A08-HashtableStorageRetrieval  
 * @date       April 24, 2019
 */
class CarList {

   private static int count = 0;
   private static int counter = 0;
   private int serialNumber;
   private int year;
   private String makeModel="";
   
   private Node front = null;
   private Node back = null;
   private Node d = null;
   private Node c = null;
   private boolean s;
   private Node cursor= front;
   
   
   /**insertInOrder Method*/
   public boolean insertInOrder(Car car){
   
      //Begins creation of Linked List given that the front is equal to null.
      if(front == null){
         int key = car.getSerialNumber();
         Node newNode = new Node(key, car);
         front = newNode;
         back = newNode; 
         count++;
         return true;
      }
         
      Node cursor = front;
      
      if(front !=null){
      int key = car.getSerialNumber();
      Node newNode = new Node(key,car);
      
      
      Node c = back;
      d = newNode;
      
      c.setNext(d);
      back = newNode;
      count++;
      
      return true; 
         
      }
      return true;
   }
   
   /**viewNode Method*/    
   public boolean viewNode(Car car){
      int key = car.getSerialNumber();
      Node newNode = new Node(key,car);
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
            System.out.println(cursor.toString());
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
   
   
   
   /**removeNode Method*/    
   public boolean removeNode(int key){
      Node newNode = new Node(key);
      
      d = front;
      c = front;
      cursor = front;
      
      for(int i= 0; i<count;i++){
            if (cursor==null){
            break;
            }
            if(cursor!=null){
               
               if((newNode.compareTo((cursor))==0)){
               
               
               c.setNext(c.getNext().getNext());
               break;
               }
               if((newNode.compareTo(cursor))!=0){
               cursor= cursor.getNext();
               }   
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
         if(cursor!=null){
            System.out.println(cursor.toString());
            cursor= cursor.getNext();
            }

         }

   }
      /**printCounter Method*/   
   public void printCounter( ){
      Node cursor = front;
      int counter2 = 0;
      
         //Utilized "for" loop to iterate through LinkedList.     
         for(int i= 0; i<count;i++){
         
         if(cursor!=null){
            counter++;
            
            cursor= cursor.getNext();
            }
   
         }
         
   }
   public void printCount(){
   System.out.println("There are currently " + counter + " vehicles stored in the database.");
   }

}

//-------------------------------------------------------------------------------------------------//

class Node implements Comparable{
	//instance variables
   
   private Car car = null;
   private Node next = null;
   public int key;
	
	/** Constructors */
   public Node(int key, Car car){
      this.setKey(key);
      this.setCar(car);
      this.next = null;
   }
   
   public Node(int key){
      this.setKey(key);
      this.setCar(car);
      this.next = null;
   }
	
   public Node(Car car, Node next){
      this.setCar(car);
      this.next = next;
   }
	
   /** Accessor Methods */
   public Node getNext(){
      return this.next;
   }
	
   public Car getCar(){
      return this.car;
   }
	/** Mutator Methods */
   public void setNext(Node next){
      this.next = next;
   }
   
  //if needed validations in here
   public void setCar(Car newCar){
      this.car = newCar;  
   } 
   public Integer setKey(Integer newKey){
      this.key = newKey;
      return newKey;  
   } 
   /** toString Method */
   public String toString( ){
      String s = this.getCar( ).toString( );
      return s;
   }
      
         /** compareTo Method */  
   public int compareTo(Object o){
      Node toCompare = (Node)o;
      return this.getCar().compareTo(((Node) toCompare).getCar());
      
   }
}

