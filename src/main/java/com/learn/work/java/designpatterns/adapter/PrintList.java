package com.learn.work.java.designpatterns.adapter;

import java.util.List;

interface PrintAdapter {
	public void print(List<String> list);
}
public class PrintList implements PrintAdapter{

	PrintString printString;

	public PrintList(PrintString printString) {
		super();
		this.printString = printString;
	}

	@Override
	public void print(List<String> list) {

		StringBuilder sb = new StringBuilder();
		for(String str:list) {
			sb.append(str+",");
		}
		printString.print(sb.toString());
	};
}
