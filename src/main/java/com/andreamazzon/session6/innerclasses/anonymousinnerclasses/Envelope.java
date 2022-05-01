package com.andreamazzon.session6.innerclasses.anonymousinnerclasses;

/**
 * This class does not implement the interface Letter, but it has an anonymous
 * inner class doing it.
 *
 * @author Andrea Mazzon
 *
 */
public class Envelope {

	private Letter letter;
	private String content = "Dear friend..";

	/**
	 * It creates an object of the class initialiting the object letter, which has a
	 * reference to the interface Letter, attaching to that interface an object of
	 * an anonymous, inner class implementing Letter. In this class, the method
	 * read() of Letter is implemented.
	 */
	public Envelope() {

		/*
		 * Anonymous inner class! Here you say that Envelope has an inner class which
		 * implements Letter (as you see from Letter before the name of the object), and
		 * that you create an object of this class (look at the -a bit odd- syntax
		 * Letter(): it's the constructor of the anonymous class which implements
		 * Letter).
		 */
		letter = new Letter(){
			//here we override the method of Letter
			@Override
			public void read() {
				System.out.println(content);
			}	
		};
		//other way, even more compact
		//letter = () -> System.out.println(content);
		// anonymous class
	}



	public Letter getMessage() {// returns the reference of an object of a class which implements Letter
		return letter;
	}

}
