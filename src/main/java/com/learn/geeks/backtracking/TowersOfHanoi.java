package com.learn.geeks.backtracking;

public class TowersOfHanoi {

	public static void main(String[] args) {
		towersofhanoi(3,1,3,2);
	}
	
	public static void towersofhanoi(int n,int fromPeg,int toPeg,int auxPeg) {
		if(n == 1)
			System.out.println(fromPeg+"->"+toPeg);
		else {
			towersofhanoi(n-1,fromPeg,auxPeg,toPeg);
			System.out.println(fromPeg+"->"+toPeg);
			towersofhanoi(n-1,auxPeg,toPeg,fromPeg);
		}
	}

}
