/**
 * @author: Blanca Polo
 * Driver for Coding Assignment Testing
 * Uses a List Object to maintain a generic list of Person objects
 * Person objects are always sorted
 */


import java.util.*;
public class PersonSortedListDriver{
   public static void main(String arg[ ])throws Exception{
     
   
      String name = "";
      String comment = " ";
      Person p; 
      Person p1;// = new Person("First Person", "comment1", 777);
      PersonSortedList personList = new PersonSortedList();
   
    
   //adding persons to the list.
      try{
         p = new Person("Nine-o-one", "comment901", 901);
         if(!(personList.insertInOrder(p))){
            System.out.println("duplicate element, not added");
         }
         else {
            System.out.println("element added");
         }
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }         
   
      try{          
         p = new Person("One-o-one", "comment101", 101);
         if(!(personList.insertInOrder(p))){
            System.out.println("duplicate element, not added");
         }
         else {
            System.out.println("element added");
         }
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
         
      try{         
         p = new Person("Five fifty five", "comment555", 555);
         if(!(personList.insertInOrder(p))){
            System.out.println("duplicate element, not added");
         }
         else {
            System.out.println("element added");
         }
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      
      try{
         p = new Person("One thirty six", "comment136", 136);
         if(!(personList.insertInOrder(p))){
            System.out.println("duplicate element, not added");
         }
         else {
            System.out.println("element added");
         }
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      //adding duplicate persons
      try{         
         p = new Person("Five fifty five", "comment555", 555);
         if(!(personList.insertInOrder(p))){
            System.out.println("duplicate element, not added");
         }
         else {
            System.out.println("element added");
         }
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      
      try{         
         p = new Person("Nine-o-one", "comment901", 901);
         if(!(personList.insertInOrder(p))){
            System.out.println("duplicate element, not added");
         }
         else {
            System.out.println("element added");
         }
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      //printing the initial list   
      System.out.println("---------Printing Sorted List-------------");
      personList.printList( ); 
      System.out.println("------------------------------------------");
           
      // Removing an existing element
      p = new Person("Five fifty five", "comment555", 555);
      if(!(personList.removeNode(p))){
         System.out.println("element:");
         System.out.println(p.toString( ));
         System.out.println("not found!");
      }
      else {
         System.out.println("element:");
         System.out.println(p.toString( ));
         System.out.println("has been removed");
      }
      
      // Attempting to remove an Non-existing element
      p = new Person("Non-existing person", "comment000", 777);
      if(!(personList.removeNode(p))){
         System.out.println("element:");
         System.out.println(p.toString( ));
         System.out.println("not found!");
      }
      else {
         System.out.println("element:");
         System.out.println(p.toString( ));
         System.out.println("has been removed");
      }        
         
     //printing the list
      System.out.println("there are " + personList.size( )+ " elements in this list");


      System.out.println("---------Printing Sorted List-------------");
      personList.printList( ); 
      System.out.println("------------------------------------------");
          
   } //ends main method

} //ends class