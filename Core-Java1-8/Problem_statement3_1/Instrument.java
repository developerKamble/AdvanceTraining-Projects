package com.coreproject1;

/*
 * Problem Statement 3: Abstract Class and Interface Solve following sub problems,
 * 3.1 Create an abstract class Instrument which is having the abstract function play. 
 * Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play 
 * method inside all three classes printing a message as follows,
 * “Piano is playing tan tan tan tan” for Piano class
 * “Flute is playing toot toot toot toot”for Flute class
 * “Guitar is playing tin tin tin”  for Guitar class
 * Note: You must not allow the user to declare an object of Instrument class.
	 * •Create an array of 10 Instruments object.
	 * •Assign different type of instrument-to-Instrument reference.
	 * •Check for the polymorphic behavior of play method.
	 * •Use the instance of operator to print that which object stored at which index of 
	 * 	  instrument array.
 * */


abstract public class Instrument {

	
	abstract public void play();
		
}
