package com.learn.work.java.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		PrintList printer = new PrintList(new PrintString());
		printer.print(list);
	}
}
