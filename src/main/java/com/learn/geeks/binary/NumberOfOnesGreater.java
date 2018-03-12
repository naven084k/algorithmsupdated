package com.learn.geeks.binary;

public class NumberOfOnesGreater {

	public static void main(String[] args) {
	  	find("",0,4);
	}
	
	public static void find(String str,int numberOfOnes,int remainingPlaces) {
		
		if(remainingPlaces == 0)
			System.out.println(str);
		else {
			find(str+"1", numberOfOnes+1, remainingPlaces-1);
			
			if(numberOfOnes > 0)
				find(str+"0", numberOfOnes-1, remainingPlaces-1);
		}
		
	}
}
