package com.mustafa.july17.comparable;

//import java.util.InputMismatchException;
//import java.util.Scanner;

record Course(Integer id,String name,Double price) {
	
}

public class DuplicateCourse {

	public static void main(String[] args) {
		Course[] courses=new Course[5];
		courses[0]=new Course(2, "rohit", 25000d);
		courses[1]=new Course(2, "arshdeep", 65000d);
		courses[2]=new Course(22, "siraj", 45000d);
		courses[3]=new Course(111, "rohit", 35000d);
		courses[4]=new Course(111, "mohit", 45000d);
		//Scanner sc=new Scanner(System.in);
		boolean isDuplicate=false;
		for(int i=0;i<=courses.length;i++) {
			for(int j=i+1;j<courses.length;j++) {
				
					if(courses[i].id()==courses[j].id()) {
						System.out.println("duplicate found"+courses[i]);
						isDuplicate= true;
					}
					
					
				
			
		}
			

	}

		if(!isDuplicate) {
			System.err.println("ther is no duplicate record");
			
		}
		
	}}

