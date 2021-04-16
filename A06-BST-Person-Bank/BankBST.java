/**
 * This class is responsible for arranging and taking in the Person object along with a
 *  key to allow the user to retrieve and edit Banking information accordingly all
 *  the while arranding this information into a binary search tree to enable quicker
 *  access to any of the users inputted into this program.
 *
 * @author     Robert Sterenchak
 * @assignment ICS 211 Assignment: A06-BST-Person-Bank  
 * @date       April 6, 2019
 */
import java.util.*;

public class BankBST{

   private BNode root;

   public void insertBNode(Person p){
      //Utilized getId() method to take in ID as the "key" parameter when adding to BST.
      int key = p.getId();
      BNode newBNode = new BNode(key, p);
      if(root == null){
         root = newBNode;
         
      }
      else {
         //designated variables to allow flexibility towards the root while adding.
         BNode pointer = root;
         BNode parent;
         
         while(true){
         
            parent = pointer;
            //Utilized key value in order to make comparisons for where each Node will be added.
            if(key < pointer.key){
               pointer = pointer.lChild;
            
               if(pointer== null){
                  parent.lChild = newBNode;
                  return;
               
               
               }
            }  else{
            
               pointer = pointer.rChild;
            
               if(pointer== null){
                  parent.rChild = newBNode;
                  return;
               
               
               }
            
            }
         }
      }
   
   }
   
   //Uses inOrder traversing in order to print all BNodes.
   public void printBSTree(BNode root){
      if(root!=null){
         
         printBSTree(root.getLChild());
         
         System.out.println(root.toString()+"balance");
         
         printBSTree(root.getRChild());
      }
   }
   //Uses inOrder traversing in order to print all BNodes.
   public void printBSTree(){
      
         
         printBSTree(root);            

      
   }
   //Utilizes this method in order to find the person object according the his or her 'key'
   public BNode find(int key, Person p){
            
      BNode pointer = root;
            
      while(key != pointer.key){
         if(key < pointer.key){
               
            pointer = pointer.rChild;
         } else{
            pointer = pointer.rChild;
         }
         
         if(pointer == null){
            System.out.println("There are no Users corresponding to the requested ID number.\n");
            return pointer;
         }
               
      }
      return pointer;
   }
}  


