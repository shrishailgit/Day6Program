package com.bridgelabz;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		StopwatchProgram stopwatchProgram =new StopwatchProgram();
		stopwatchProgram.StopwatchProgram();
		
		System.out.println("Second Program Start");
		Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        
        ToBinary   binay   =new    ToBinary ();
        ToBinary.toBinary(number);	
		
}

	
	
}
