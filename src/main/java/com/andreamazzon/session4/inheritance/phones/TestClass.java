package com.andreamazzon.session4.inheritance.phones;

import static com.andreamazzon.session3.useful.Print.printn;

/**
 * The main method of this class illustrates the basic features of inheritance
 *
 * @author Andrea Mazzon
 *
 */
public class TestClass {
	public static void main(String[] args) {

		printn("First the base class:");
		printn();

		Phone normalPhone = new Phone();
		printn();
		normalPhone.call();
		printn();
		normalPhone.checkIfSmartphone();
		printn();
		printn();
		//normalPhone.goOnInternet();//error! this is a method of the derived class only

		printn("Then the derived class:");
		printn();

		Smartphone newSmartphone = new Smartphone();
		printn();
		newSmartphone.call();
		printn();
		newSmartphone.goOnInternet(); // it can
		printn();
		newSmartphone.checkIfSmartphone();
		printn();
		printn();

		printn("Then reference to the base class, constructor of the derived class");
		printn();

		/*
		 * See what happens if we construct an object with the constructor of the
		 * derived class but giving it a reference to the base class: essentially we are
		 * assigning a derived class object to a parent class reference. This is
		 * possible. The object created in this way cannot call the methods which are
		 * specific of the new class. However, it calls the constructor of the derived
		 * class: look at the value of the field isSmartphone, and to the messages printed
		 * in the constructor. Note that which constructor to call (i.e., how to call
		 * the method constructor) is something which is resolved at running time.
		 */
		Phone anotherSmartphone = new Smartphone();
		printn();
		anotherSmartphone.call();
		printn();
		//anotherSmartphone.goOnInternet(); //it cannot
		anotherSmartphone.checkIfSmartphone();

	}
}
