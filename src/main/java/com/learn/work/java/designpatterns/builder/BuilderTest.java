package com.learn.work.java.designpatterns.builder;

public class BuilderTest {

	public static void main(String[] args) {
		Student st = new Student.StudentBuilder().setFirstName("naveen").setLastName("kumar").build();
		System.out.println(st.firstName);
	}
}
