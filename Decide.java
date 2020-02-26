/**
 * A class for choosing an option of what to do
 *
 * Tobias Ephron
 * Version 1.0
 */

import java.util.*;
class Decide{
	Random r = new Random();

	/**
	 * A method from randomly selecting an option for the given User
	 * 
	 * @param u the given user for which an option will be chosen
	 * @return a string of the name of the chosen option
	 */
	public String chooseRandom(User u){
		int ran = r.nextInt(u.options.size());
		return u.options.get(ran);
	}
}