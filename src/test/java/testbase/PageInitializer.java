package testbase;


import page.UserAllElements;

public class PageInitializer extends  BaseClass{
	
	/**
	 * Please create here the object of certain Page (make sure it's public static)
	 */
	public static UserAllElements allElements;

	
	public static void initialize() {
		/**
		 * Please assign here the object to particular Page class (i.e. login = new LoginPageElements)
		 */

		allElements = new UserAllElements();

	}
	
	
}
