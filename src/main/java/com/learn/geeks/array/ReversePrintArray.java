package com.learn.geeks.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReversePrintArray {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = Integer.parseInt(scanner.nextLine().trim());
		String text = scanner.nextLine();
		String[] values=text.split(" ");
		for(int i=values.length-1;i>=0;i--) {
			System.out.print(values[i]+" ");
		}
		scanner.close();
	}

}
