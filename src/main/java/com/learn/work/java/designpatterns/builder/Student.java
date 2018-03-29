package com.learn.work.java.designpatterns.builder;

public class Student {

	String firstName;
	String lastName;
	
	public Student(StudentBuilder studentBuilder) {
		this.firstName = studentBuilder.firstName;
		this.lastName=studentBuilder.lastName;
	}
	
	public static class StudentBuilder {
		String firstName;
		String lastName;
		
		public StudentBuilder setFirstName(String firstName) {
			this.firstName=firstName;
			return this;
		}
		
		public StudentBuilder setLastName(String secondName) {
		  this.lastName = secondName;	
		  return this;
		}
		
		public Student build() {
			return new Student(this);
		}
		
	}
}
