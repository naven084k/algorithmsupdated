package com.learn.geeks.general;

public class ToggleBits {

	public static void main(String[] args) {
		
		int n=50;
		int nextSetBit = 1;
		int solution = 0;
		System.out.println(Integer.toBinaryString(n));
		
		while(n > 0) {
			int lastBit = n&1;
			if(lastBit == 0) {
				solution |= nextSetBit;
			}
		
			n = n >> 1;
			nextSetBit = nextSetBit << 1;
		}
		
		System.out.println(solution);
		System.out.println(Integer.toBinaryString(solution));
	}
}
