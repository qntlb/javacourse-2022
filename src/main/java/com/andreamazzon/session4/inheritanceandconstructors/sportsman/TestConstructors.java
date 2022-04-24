package com.andreamazzon.session4.inheritanceandconstructors.sportsman;

import com.andreamazzon.session3.useful.Print;
/**
 * This class tests how inheritance works when the base class has more than one
 * constructor. Note which constructors are called.
 *
 * @author Andrea Mazzon
 *
 */

public class TestConstructors {

	public static void main(String[] args) {

		Sportsman messi = new Sportsman("Leo", "PSG");// just call the constructor of the base class
		
		Print.printn();
		
		Tennisplayer federer = new Tennisplayer("Roger");

	}
}