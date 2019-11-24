/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Executor;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author Gary
 */
public class GaryRaces extends Thread{
 public static String winner;

	public void race(){

		

		for(int distance=1;distance<=100;distance++){

			System.out.println("Distance coverred by "+Thread.currentThread().getName()+" is "+distance+" meters ");

			//check if race is complete nd if there is a winner already

			

			boolean isRaceWon = this.isRaceWon(distance);

			if(isRaceWon){

				break;

			}

		}

		

	}

	

	private boolean isRaceWon(int totalDistanceCovered){

		boolean isRaceWon = false;

		if((GaryRaces.winner==null)&&(totalDistanceCovered==100)){

			String winnerName=Thread.currentThread().getName();

			GaryRaces.winner=winnerName; //setting the winner name)

			System.out.println("Winner is "+GaryRaces.winner);

			isRaceWon=true;

		}

		else if(GaryRaces.winner==null){

			isRaceWon=false;

		}

		else if(GaryRaces.winner==null){

			isRaceWon=true;

	}

		return isRaceWon;

    }

    @Override

    public void run(){

	this.race();

  }   
}
