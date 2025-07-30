package com.mustafa.july18.comparable.comparetor;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerComparator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=Integer.parseInt(sc.nextLine());
		Customer [] customers=new Customer[size];
		for(int i=0;i<customers.length;i++) {
			System.out.print("Enter the id:");
			int id1=Integer.parseInt(sc.nextLine());
			System.out.print("enter the name of trainer:");
			String name1=sc.nextLine();
			System.out.print("enter the salary of trainer:");
			double bill=Double.parseDouble(sc.nextLine());
			
			
			
			customers[i]=new Customer(id1, name1, bill);
		}
		//Arrays.sort(customers,(t1,t2)->t1.name().compareTo(t2.name()));
		Arrays.sort(customers,(t1,t2)->t2.name().compareTo(t1.name()));
		//Arrays.sort(customers);
		
		
		for(Customer customer:customers) {
			System.out.println(customer);
		}
	}

	}


