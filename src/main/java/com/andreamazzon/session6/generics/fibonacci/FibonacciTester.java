package com.andreamazzon.session6.generics.fibonacci;

/**
 * This class has a main method when we generate the first n numbers of the
 * Fibonacci sequence. This is done with the help of the next() method of the
 * class FibonacciSequence: for objects of this class, next() returns an Integer
 *
 * @author Andrea Mazzon
 *
 */
public class FibonacciTester {
	public static void main(String[] args) {
		int numberOfFibonacciNumbers = 10;// we want to compute and print the first n numbers of the Fibonacci sequence
		FibonacciSequence fibonacci = new FibonacciSequence();
		System.out.println("First " + numberOfFibonacciNumbers + " numbers of the Fibonacci sequence: ");
		
		//a way to compute how much time we need to perform a given computation
		long timeBeginning = System.currentTimeMillis();
		for (int i = 0; i < numberOfFibonacciNumbers; i++) {
			System.out.println(fibonacci.next() + " ");
		}
		long timeEnd = System.currentTimeMillis();
		long elapsedTime =  timeEnd - timeBeginning;
		System.out.println("Elapsed time: " + elapsedTime);

	}
}
