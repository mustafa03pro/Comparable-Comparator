package com.mustafa.july16.comparable;

public record Student(String name, EducationInstitute institute)
{
   public void viewCoursesAndFees()
   {
       Course[] courses = institute.courses();
       System.out.println("Courses and Fees :");
       
       for(Course course : courses)
       {
           System.out.println(course.id()+" : "+course.name()+" : "+course.fee());
       }      
   }
   
   public void viewOffers()
   {
        Offer[] offers = institute.offers();
        System.out.println("Available offers :");
        for(Offer offer : offers)
        {
            System.out.println(offer.offerText());
        }
   }
   
   
   public void enrollInCourse(int courseId)
   {
      institute.enrollStudentInCourse(courseId, name);
   }
   
}
