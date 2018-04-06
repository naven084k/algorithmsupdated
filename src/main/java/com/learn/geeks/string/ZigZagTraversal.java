package com.learn.geeks.string;

public class ZigZagTraversal {

	public static void main(String[] args) {

       String str="ABCDEFGHIJ";
       System.out.println(convert(str,4));

	}
	
	public static String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
	 
		StringBuilder sb = new StringBuilder();
		// step
		int step = 2 * numRows - 2;
	 
		for (int i = 0; i < numRows; i++) {
			//first & last rows
			if (i == 0 || i == numRows - 1) {
				for (int j = i; j < s.length(); j = j + step) {
					sb.append(s.charAt(j));
					sb.append("   ");
				}
			//middle rows	
			} else {
				int j = i;
				boolean flag = true;
				int step1 = 2 * (numRows - 1 - i);
				int step2 = step - step1;
	 
				while (j < s.length()) {
					sb.append(s.charAt(j));
					if (flag)
						j = j + step1;
					else
						j = j + step2;
					flag = !flag;
				}
				sb.append("   ");
			}
		}
	 
		return sb.toString();
	}

}
