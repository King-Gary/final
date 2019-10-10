/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppCont;

import java.util.Scanner;

/**
 *
 * @author Gary
 */
public class Testing {
    public static void main( String[] args )
  {
    ApplicationController frontController = new ApplicationController();
    frontController.dispatchRequest("FIRST");
    System.out.println();
    frontController.dispatchRequest("SECOND");
    System.out.println();
    frontController.dispatchRequest("THIRD"); 
    //String user_input;  
     System.out.println("It's working");
    Scanner input = new Scanner(System.in);
    System.out.println("Please type first, second, or third to go to a page.");
    frontController.dispatchRequest(input.next());
      
  }
}
