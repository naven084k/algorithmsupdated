package com.learn.geeks.string;

public class ConvertNumToWord {

	public static void main(String[] args) {
		
		final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
				" seventy", " eighty", " ninety" };

		final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
				" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
				" seventeen", " eighteen", " nineteen" };
		
		int num = 25;
		
		if(num > 20) {
			int tensDigit = num/10;
			int rem = num%10;
			System.out.println(tensNames[tensDigit]+" "+numNames[rem]);
		}
		
	}
}
