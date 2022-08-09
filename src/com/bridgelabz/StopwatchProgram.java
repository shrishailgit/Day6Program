package com.bridgelabz;

public class StopwatchProgram {

	 void StopwatchProgram() {
		  long start = System.nanoTime();
	        System.out.println(" Starting Time  "+start);
	        long finish = System.nanoTime();
	        System.out.println(" Finish Time  "+finish);
	        long timeElapsed = finish - start;
	        System.out.println(" Time Elapsed between start and finish "+timeElapsed); 
		  
		  
	  }
	
	}


