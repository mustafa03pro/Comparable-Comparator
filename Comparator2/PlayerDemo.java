package com.mustafa.july17.comparable;

import java.util.InputMismatchException;
import java.util.Scanner;

record Player(Integer id,String name,Double price) {
	
}

public class PlayerDemo {

	public static void main(String[] args) {
		Player[] players=new Player[5];
		players[0]=new Player(111, "rohit", 25000d);
		players[1]=new Player(222, "arshdeep", 65000d);
		players[2]=new Player(233, "siraj", 45000d);
		players[3]=new Player(422, "rohit", 35000d);
		players[4]=new Player(444, "mohit", 45000d);
		Scanner sc=new Scanner(System.in);
		try(sc){
			System.out.println("enter the player id");
			int id=Integer.parseInt(sc.nextLine());
			for(Player player:players) {
				if(player.id()==id) {
					System.out.println("the player with id "+id+"and "+player);
					
				}
				
			}
			
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println(e);
		}

	}

}
