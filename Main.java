/**
 * The main class for the What To Do program
 *
 * Tobias Ephron
 * Version 1.0
 */

import java.util.*;
public class Main{

	/**
	 * The main method
	 *
	 * @param args an array of strings representing the input
	 */
	public static void main(String[] args){
		System.out.println("Welcome to the What To Do program.");
		Scanner s = new Scanner(System.in);
		User u;
		Decide d = new Decide();
		boolean run = true;
		while(run){
			System.out.println("");
			System.out.println("What's your name?");
			u = new User(s.nextLine());
			if(u.getName().toLowerCase().equals("quit")){
				run = false;
				continue;
			}
			u.importOptions();
			u.printOptions();
			boolean next = true;
			boolean add = false, choose = false, remove = false, print = false;
			while(next){
				String ans = "";
				System.out.println("");
				System.out.println("What would you like to do?");
				System.out.println("Say \"choose\" to get an option");
				System.out.println("Say \"add\" to add a new option");
				System.out.println("Say \"remove\" to remove an option");
				System.out.println("Say \"print\" to print " + u.getName() + "\'s options");
				System.out.println("Say \"quit\" to quit the program");
				System.out.println("");
				ans = s.nextLine().toLowerCase();
				if(ans.equals("choose")){
					System.out.println("");
					System.out.println("You should: " + d.chooseRandom(u) + "!");
					System.out.println("");
				}
				else if(ans.equals("add")){
					u.importOptions();
				}
				else if(ans.equals("remove")){
					System.out.println("");
					System.out.println("What would you like to remove " + u.getName() + "?");
					u.removeOption(s.nextLine());
				}
				else if(ans.equals("print")){
					u.printOptions();
				}
				else if(ans.equals("quit")){
					next = false;
				}
			}
			boolean ask = true;
			while(ask){
				System.out.println("");
				System.out.println("Would you like to create a new user? (y or n)");
				String a = s.nextLine();
				if(a.charAt(0) == 'y'){
					ask = false;
					continue;
				}
				else if(a.charAt(0) == 'n'){
					ask = false;
					run = false;
				}
			}
		}
		System.out.println("");
		System.out.println("Thanks for using the What To Do program!");
		System.out.println("Have a good day!");
	}
}