/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executor;

/**
 *
 * @author Gary
 */
public class TheRace {
    	public static void main(String[]args){

		GaryRaces racer = new GaryRaces();

		Thread jonhThread = new Thread(racer,"Jonh");

		Thread steveThread = new Thread(racer,"Steve");

		

		//Race to start, tell threads to start

		

		jonhThread.start();

		steveThread.start();

	}
}
