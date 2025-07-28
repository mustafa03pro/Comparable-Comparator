package com.mustafa.july16.comparable;


 


 



import java.util.Scanner;

public class StudentEnrollmentProcess
{
    public static void main(String[] args)
    {
        Course []courses = new Course[3];
        courses[0] = new Course(111, "Java", 35000D);
        courses[1] = new Course(222, ".Net", 30000D);
        courses[2] = new Course(333, "Python", 32000D);
       
        Offer []offers = new Offer[2];
        offers[0] = new Offer("Special discount : Get 20% off on all courses!");
        offers[1] = new Offer("Limited time offer: Enroll in any two courses and get one course free!");
       
       
        EnrollCourse institute = new EnrollCourse(courses, offers);
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name:");
        String name = sc.nextLine();
       
        Student2 s1 = new Student2(name, institute);
        s1.viewCoursesAndFees();
        s1.viewOffers();
        System.out.print("Enter Course Id ");
        int courseId = sc.nextInt();
        s1.enrollInCourse(courseId);
        sc.close();
       
       
       
    }

}