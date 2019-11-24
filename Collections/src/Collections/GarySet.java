/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author Gary
 */

import java.util.*;



public class GarySet {



  public static void main(String args[]) { 
      
      System.out.println("This set does not have a duplicate");

     int count[] = {24,20,5,54,45};
     
     System.out.println("This set does have a duplicate");
     
     int counter[] = {24,20,5,54,45,20};


     Set<Integer> set = new HashSet<Integer>();

     try{

        for(int i = 0; i<5; i++){

           set.add(count[i]);

        }

        System.out.println(set);

  

        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);

        System.out.println("Sorted list is:"+" "+ sortedSet);

      



        System.out.println("The First number is : "+

                          (Integer)sortedSet.first());

        

        

        System.out.println("The last last number is: "+

                        (Integer)sortedSet.last());

     }

     try{

        for(int i = 0; i<5; i++){

           set.add(counter[i]);

        }

        System.out.println(set);

  

        TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);

        System.out.println("Sorted list is:"+" "+ sortedSet);

      



        System.out.println("The First number is : "+

                          (Integer)sortedSet.first());

        

        

        System.out.println("The last last number is: "+

                        (Integer)sortedSet.last());

     }
     catch(Exception e){}

  }

} 
