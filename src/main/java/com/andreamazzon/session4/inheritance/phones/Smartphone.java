package com.andreamazzon.session4.inheritance.phones;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * This class illustrates one of the uses of inheritance: having the same methods and fields of the parent
 * class - without having to specify them again - plus possibly new methods or fields typical of the derived
 * class.
 *
 * @author Andrea Mazzon
 *
 */
public class Smartphone extends Phone {

	
	Smartphone() { //it automatically calls also the constructor of the base class
		printn("But also to navigate on internet");
		isSmartphone = true;
	}
	

	void goOnInternet() { // this is a specific method of the derived class
		printn("I am navigating on Internet");
	}	
	
	void goOnInternetAndThenCall() { // this is a specific method of the derived class
		printn("I am navigating on Internet, to get the information that is useful for the person I will call");
		call();
	}	
	
	@Override
	protected void call() {
		super.call();
		printn("I also have the possibility to video call"); 
	}
}