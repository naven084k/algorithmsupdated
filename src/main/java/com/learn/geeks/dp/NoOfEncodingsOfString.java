package com.learn.geeks.dp;

public class NoOfEncodingsOfString {

	public static void main(String[] args) {
		System.out.println(recursive("123"));
		decodingDp("123");
	}

	public static int recursive(String str) {
		if(str.length() == 1)
			return 1;
		else if(str.length() == 0)
			return 1;
		else {
			String twodigits = str.charAt(str.length()-2)+""+str.charAt(str.length()-1);
			int singleLetterTree = recursive(str.substring(0, str.length()-1));
			int twodigitTree = Integer.parseInt(twodigits) <=26?recursive(str.substring(0,str.length()-2)):0;
			return singleLetterTree+twodigitTree;
		}
	}
	
	public static void decodingDp(String str) {
		int decode[]=new int[str.length()+1];
		decode[0]=1;
		decode[1]=1;
		
		for(int i=2;i<=str.length();i++) {
			decode[i] = decode[i-1];
			if((str.charAt(i-2) < '2') || (str.charAt(i-2) =='2' && str.charAt(i-1) <'7'))
				decode[i] = decode[i]+decode[i-2];
		}
		System.out.println(decode[str.length()]);
	}
}
