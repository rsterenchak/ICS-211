//author: Blanca Polo
//Test driver for Assignment 03

import java.util.*;
public class People{
   public static void main(String arg[ ])throws Exception{
     
      int id = 0;
      String name = "";
      String comment = " ";
      Person p;
      ArrayList <Person> personList = new ArrayList< >();
         
   
      try{
         p = new Person(123, "Abc Deff", "comment1");
         personList.add(p);
                 
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }  
   
      try{
         p = new Person(459, "second person", "comment2");
         personList.add(p);     
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      
      try{
         p = new Person(111, "ICS person", "comment4");
         personList.add(p);     
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
   
      try{
         p = new Person(59, "wrong person", "comment3");
         personList.add(p);     
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
         
      try{
         p = new Person(444, "Name here", ""); //empty string
         personList.add(p);     
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      
      try{
         p = new Person(222, "persona");
         personList.add(p);     
      }
      catch(PException pe){
         System.out.println(pe.getMessage( ));
      }
      
      //sorting the list
      System.out.println("\nsorting the list by ID and printing it\n");
      
      
      Collections.sort(personList);
      for(Person onePerson: personList){
         System.out.println(onePerson.toString( ));
      }     
             
   } //ends main method

} //ends class