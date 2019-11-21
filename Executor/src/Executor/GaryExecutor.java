/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executor;

import java.util.concurrent.*;

/**
 *
 * @author Gary
 */
public class GaryExecutor {
    public static void main(String args[])

	{

		ExecutorService pool = Executors.newFixedThreadPool(3);

		PrintJob []vec = { new PrintJob("David", 4),

				new PrintJob("Javier", 12),

				new PrintJob("Jonh", 15),

				new PrintJob("Aubrey", 9),

				new PrintJob("Jasmine", 3),

				new PrintJob("Tatiana", 10)};

		for(int i=0; i<vec.length; i++)

		{

			pool.submit(vec[i]);

		}	

	}
}

