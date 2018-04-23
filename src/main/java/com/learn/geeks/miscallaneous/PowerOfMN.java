package com.learn.geeks.miscallaneous;

public class PowerOfMN {

	public static void main(String[] args) {
		System.out.println(power(2,6));
	}
	
	static int power(int m,int n)
	{
		int res=1;
		while(n > 0) {
			
			if(n%2 == 1)
				res = res*m;
			
			n = n/2;
			m = m*m;
		}
		
		return res;
	}
}
