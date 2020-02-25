/**
 * The class for getting information on the current user
 * 
 * Tobias Ephron
 * Version 1.0
 */

import java.util.*;
import java.io.*;
class User{
	/** Initialize Scanner object */
	Scanner s = new Scanner(System.in);

	/** Instance variables */
	String filePath;
	String name;
	ArrayList<String> options;

	/**
	 * Constructor method
	 *
	 * @param name name of user
	 */
	public User(String name){
		this.name = name;
	}

	/**
	 * A method for getting the users options
	 */
	public void importOptions(){
		boolean ask = true;;
		while(ask){
			boolean file;
			System.out.println("");
			System.out.println("Would you like to import your options from a file? (y or n)");
			String ans = s.nextLine().toLowerCase();
			if(ans.charAt(0) == 'y'){
				file = true;
				ask = false;
			}
			else if(ans.charAt(0) == 'n'){
				file = false;
				ask = false;
			}
		}
		addOptions(file);
	}	

	/**
	 * A method to add option(s)
	 * 
	 * @param file a boolean to know if the options are coming from a file or not
	 */
	public void addOptions(boolean file,boolean input){
		if(input){
			System.out.println("");
			System.out.print("Add option: ")
			String newOp = s.nextLine();
			if(!this.options.contains(newOp)){
				this.options.add(newOp);
				System.out.println("");
				System.out.println("Added \"" + newOp + "\"");
			}
			else{
				System.out.println("");
				System.out.println("This is already an option.")
			}
		}
		while(file){
			System.out.println("");
			System.out.print("File Path: ");
			filePath = s.nextLine();
			if(filePath.toLowerCase().equals("back")){
				file = false;
				continue;
			}
			File f = new File(filePath);
			try{
				if(f.exists()){
					if(f.isFile()){
						try{
							BufferedReader r = new BufferedReader(new FileReader(filePath));
							String ln;
							while((ln = r.readLine()) != null){
								if(!this.options.contains(ln)){
									this.options.add(ln);
									System.out.println("");
									System.out.println("Added \"" + ln + "\"");
								}
							}
						}
						catch(IOException e){
							System.out.println("");
							System.err.println(e);
							continue;
						}
					}
					else{
						System.out.println("");
						System.out.println("This file path is not a file.");
					}
				}
				else{
					System.out.println("");
					System.out.println("This file does not exists.");
				}
			}
			catch(SecurityException e){
				System.out.println("");
				System.err.println(e); // no permissions
				System.out.println("");
				System.out.println("Please give a valid file path.");
				continue;
			}
		}
	}

	/**
	 * A method to remove an option from the list
	 *
	 * @param op a string for the option to be removed
	 */
	public void removeOption(String op){
		try{
			this.options.remove(op);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("");
			System.out.println("Could not remove because this option is not on the list.");
		}
	}

	/**
	 * A method to print the list of options
	 */
	public void printOptions(){
		System.out.println("");
		System.out.println("Options:");
		int i = 0;
		int last;
		while(i < this.options.size()){
			System.out.println(i + ": " + this.options.get(i));;
			i++;
		}
	}
/**
 * The class for getting information on the current user
 * 
 * Tobias Ephron
 * Version 1.0
 */

import java.util.*;
import java.io.*;
class User{
	/** Initialize Scanner object */
	Scanner s = new Scanner(System.in);

	/** Instance variables */
	String filePath;
	String name;
	ArrayList<String> options;

	/**
	 * Constructor method
	 *
	 * @param name name of user
	 */
	public User(String name){
		this.name = name;
	}

	/**
	 * A method for getting the users options
	 */
	public void importOptions(){
		boolean ask = true;;
		while(ask){
			boolean file;
			System.out.println("");
			System.out.println("Would you like to import your options from a file? (y or n)");
			String ans = s.nextLine().toLowerCase();
			if(ans.charAt(0) == 'y'){
				file = true;
				ask = false;
			}
			else if(ans.charAt(0) == 'n'){
				file = false;
				ask = false;
			}
		}
		addOptions(file);
	}	

	/**
	 * A method to add option(s)
	 * 
	 * @param file a boolean to know if the options are coming from a file or not
	 */
	public void addOptions(boolean file){
		while(!file){}
		while(file){
			System.out.println("");
			System.out.print("File Path: ");
			filePath = s.nextLine();
			if(filePath.toLowerCase().equals("back")){
				file = false;
				continue;
			}
			File f = new File(filePath);
			try{
				if(f.exists()){
					if(f.isFile()){
						try{
							BufferedReader r = new BufferedReader(new FileReader(filePath));
							String ln;
							while((ln = r.readLine()) != null){
								if(!options.contains(ln)){
									options.add(ln);
									System.out.println("");
									System.out.println("Added \"ln\"");
								}
							}
						}
						catch(IOException e){
							System.out.println("");
							System.err.println(e);
							continue;
						}
					}
					else{
						System.out.println("");
						System.out.println("This file path is not a file");
					}
				}
				else{
					System.out.println("");
					System.out.println("This file does not exists");
				}
			}
			catch(SecurityException e){
				System.out.println("");
				System.err.println(e); // no permissions
				System.out.println("");
				System.out.println("Please give a valid file path");
				continue;
			}
		}
	}

	public void printOptions(){
		System.out.println("");
		System.out.println("Options:");
		int i = 0;
		int last;
		while(i < options.size()){
			System.out.print()
			i++;
		}
	}
}