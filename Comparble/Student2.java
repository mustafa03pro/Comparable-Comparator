package com.mustafa.july16.comparable;

public record Student2(String name,EnrollCourse institute) {
	public void viewCoursesAndFees() {
		Course[] courses=institute.courses();
		for(Course course:courses) {
			System.out.println(course.id()+","+course.name()+","+course.fee());
		}
	}
	public void viewOffers() {
		Offer[] offers=institute.offer();
		System.out.println("the offers are: ");
		for(Offer offer:offers) {
			System.out.println(offer.offerText());
		}
	}
	public void enrollInCourse(int courseId) {
		institute.enrollStudent(courseId, name);
		
	}

}
