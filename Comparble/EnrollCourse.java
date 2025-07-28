package com.mustafa.july16.comparable;

public record EnrollCourse(Course []courses,Offer []offer) {
	public void enrollStudent(int courseid,String studentName) {
		boolean isFound = false;
		for(int i=0;i<courses.length;i++) {
			if(courseid==courses[i].id()) {
				System.out.println(studentName+"has entered"+courses[i].name());
				isFound =true;
			}
			if(!isFound) {
				System.out.println("course with id"+courses[i]+"not found");
			}
		}
		
		
	}

}
