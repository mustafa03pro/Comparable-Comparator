package com.mustafa.july16.comparable;


public record EducationInstitute(Course []courses, Offer []offers)
{
    public void enrollStudentInCourse(int courseId, String studentName)
    {
        boolean isFound = false;
       
        for(int i=0; i<courses.length; i++)
        {
            if(courseId == courses[i].id())
            {
                System.out.println(studentName+" has enrolled in "+courses[i].name());
                isFound = true;
            }
        }
       
        if(!isFound)
        {
            System.err.println("Couse with ID "+courseId+" not found");
        }
    }
}