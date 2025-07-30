package com.mustafa.july18.comparable.comparetor;

import java.util.Arrays;
import java.util.Scanner;

public class TrainerComparable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=Integer.parseInt(sc.nextLine());
		Trainer [] Trainers=new Trainer[size];
		for(int i=0;i<Trainers.length;i++) {
			System.out.print("Enter the id:");
			int id=Integer.parseInt(sc.nextLine());
			System.out.print("enter the name of trainer:");
			String name=sc.nextLine();
			System.out.print("enter the salary of trainer:");
			double sal=Double.parseDouble(sc.nextLine());
			System.out.print("enter the experience of trainer:");
			int exp=Integer.parseInt(sc.nextLine());
			
			
			Trainers[i]=new Trainer(id, name, sal, exp);
		}
		Arrays.sort(Trainers);
		for(Trainer trainer:Trainers) {
			System.out.println(trainer);
		}
	}
	

}
