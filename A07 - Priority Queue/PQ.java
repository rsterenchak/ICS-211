/**
 *  This method is responsible for completing certain functions of an array of Patients.
 *  Patients are added added and removed according to the Priority Queue inputted from the User.
 *  Patients are removed in the form of a Queue. So whoever is first in line will be seen next.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A07 - Priority Queue  
 * @date       April 25, 2019
 * @bugs       I had a hard time getting the removeElement method just right. 
 *             In certain situations the Nullpointer Exception will be thrown.
 */
import java.util.*;
public class PQ {
   
   //Index constantly references the next open "null" position.
   private int index;
   //Used within the size method.
   private int size;
   //Used as a reference to arr[0] or the first position of the array.
   private int root;
   //Initialized array and is used as reference throughout program
   //when using compareTo method and comparisons to "null".
   private Person [] arr = new Person[15]; 
  
  
  /** AddElement Method */
   public void addElement(Person person){
      //adds elements to the array and compares with parent in order to 
      //position it correctly within the heap
      int i = index;
      int leftChild = ((2*i) + 1);
      int rightChild = ((2*i) +2);
      int parent = ((i-1)/2);
   
        if(index==0){
         arr[0] = person;
         
         index++;
      }
      
      else{
      
         if ((person.compareTo(arr[parent])==0) || (person.compareTo(arr[parent]) < 0)){
            arr[index] = person;
         
         }
         
         while(person.compareTo(arr[parent]) > 0){
            if(person.compareTo(arr[parent]) > 0){
            
               arr[i] = arr[parent];
               arr[parent] = person;
            
            }
            i = parent;
            parent = ((i-1)/2);
         }   
         index++;
         i = index;
      
      }
   }//ends addElement
   
   /** removeElement Method */
   public boolean removeElement(){
      //Initially removes element from root and stores last element into the root positions arr[0].
      //true if element removed
      //false if empty
      int i = root;
      int leftChild = ((2*i) + 1);
      int rightChild = ((2*i) +2);
      int parent = ((i-1)/2);
         
      if(arr[0]!=null){
      arr[root] = arr[0];
      
      arr[0] = arr[index - 1];
      arr[index - 1] = null;
      root = 0;
      index--;
      Person x = arr[root];
      
      while(((arr[leftChild]!=null) && (arr[rightChild]==null))|| ((arr[leftChild]!=null) && (arr[rightChild]!=null))){
      
            arr[root] = x;
            i = root;
            leftChild = ((2*i) + 1);
            rightChild = ((2*i) +2);
            parent = ((i-1)/2);
         //if both not null
         while((arr[leftChild]!=null) && (arr[rightChild]!=null)){
            
            //left is greater than right
            if((arr[leftChild]!=null) && (arr[leftChild]).compareTo(arr[rightChild]) >= 0){
            
               //x is less than left//and EQUAL TO
               if((x.compareTo(arr[leftChild]) <= 0)){
                  arr[root] = arr[leftChild];
                  arr[leftChild]  = x;
                  x = arr[leftChild];
                  //root integer becomes leftChild integer
                  root = leftChild;
                  i = root;
                  leftChild = ((2*i) + 1);
                  rightChild = ((2*i) +2);
            
            }
            }
            
            
            //if right is greater than left
            if((arr[rightChild]!=null) && (arr[rightChild]).compareTo(arr[leftChild]) >= 0){
            
               //if x is less than right child
               if((x.compareTo(arr[rightChild]) <= 0)){
                  arr[root] = arr[rightChild];
                  arr[rightChild]  = x;
                  x = arr[rightChild];
                  //root integer becomes leftChild integer
                  root = rightChild;
                  i = root;
                  leftChild = ((2*i) + 1);
                  rightChild = ((2*i) +2);
            
            }
               
               }
               }
          //if left is not null, right is null     
          if((arr[leftChild]!=null) && (arr[rightChild]==null)){
          
               //if x is less than left child
               if((x.compareTo(arr[leftChild]) <= 0)){
                  arr[root] = arr[leftChild];
                  arr[leftChild]  = x;
                  x = arr[leftChild];
                  //root integer becomes leftChild integer
                  root = leftChild;
                  i = root;
                  leftChild = ((2*i) + 1);
                  rightChild = ((2*i) +2);
            
            }
         
         }
         //if left contains number, or right and left contain number
         if(((arr[leftChild]!=null) && (arr[rightChild]==null)) || ((arr[rightChild]!=null) && (arr[leftChild]!=null))){
         //if x is greater than left and right is null, or greater than left and right
         if(((x.compareTo(arr[leftChild])>=0) && (arr[rightChild]==null)) || ((x.compareTo(arr[leftChild])>=0) && (x.compareTo(arr[rightChild])>=0))){
            return false;
         }
         }
      
      }
      return true;
   }
   if(arr[0]==null){
   return false;
   }
   return true;
 }//ends removeElement  
 
   /** PrintQueue Method */
   public void printQueue(){
      //Patients list is printed beginning from the root stopping just before arr[i] is equal to null.
      if(arr[0]!=null){
         int i = 0;
         size = index;
         System.out.println("Patient List:\n----------------------");  
         for(i = 0; arr[i]!=null; i++){
            Person x =arr[i];
            System.out.print(x + "\n");
         }
      }
      else{
         System.out.println("The Patient List is currently empty...");
      }  
   }
   
   /** DeleteQueue Method */
   public void deleteQueue(){
      int i = 0;
      for(i = 0; i<=index; i++){
         arr[i] = null;
         
      }
      index = 0;
      System.out.println("All Patients have been deleted from the list.");
   }
   
   /** Size Method */
   public void size(){
      //Gives current amount of Patients stored in the array.
      int i = 0;
      int size = 0;
      for(i = 0; arr[i]!=null; i++){
      size++;
      }
      System.out.println("Current Number of Patients: " + size);
   }
   
}
  