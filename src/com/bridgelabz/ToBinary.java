package com.bridgelabz;

import java.util.Scanner;

public class ToBinary {
	
    public static void toBinary(int number){
        int binary[] = new int[40];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.println();
    }
	
    
}
