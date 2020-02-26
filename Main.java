/**
 * The main class for the What To Do program
 *
 * Tobias Ephron
 * Version 1.0
 */

import java.util.*;
class Main{
	// Initialize Scanner object
	Scanner s = new Scanner(System.in);

	// Instance variables
	User u;

	/**
	 * The main method
	 *
	 * @param args an array of strings representing the input
	 */
	public static void main(String[] args){
		System.out.println("Welcome to the What To Do program.");
		boolean run = true;
		boolean getUser = true;
		while(run){
			while(getUser){
				System.out.println("");
				System.out.println("What's your name?");
				u = new User(s.nextLine());
				getUser = false;
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
				System.out.println("Say \"print\" to print + " + u.name() "\'s options");
				System.out.println("Say \"quit\" to quit the program");
				System.out.println("");
				if(s.nextLine().toLowerCase().equals("choose")){

				}
				else if()
			}
		}
	}
}