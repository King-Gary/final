/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;

/**
 *
 * @author Gary
 */
public class GaryCollection {
    	public static void main(String[] args) {

		

		System.out.println( "Hello\n" ); 

		

		List list = new LinkedList();



list.add("Networking");

list.add("and Server Administration");

list.add(0, "Cyber Security");



	      System.out.println("My Name is Jonathan and I like: ");

	      System.out.println(list);     

String[] things ={"tv","couch","table"};

		List<String> List1 = new ArrayList<String>();

		

		//add array items to list

		

		for(String x: things)

			List1.add(x);

		

		String[] things2 ={"carpet","toys","food"};

		List<String> List2 = new ArrayList<String>();

		

		//add array items to list2

		

				for(String y: things2)

					List2.add(y);

				

				//Print the List

				

				

				for(int i =0;i<List1.size();i++){

					System.out.printf("%s ", List1.get(i));

					

				//	for(int i =0;i<List2.size();i++){

				//	System.out.printf("%s ", List2.get(i)); 

				

				}

	}					

}

