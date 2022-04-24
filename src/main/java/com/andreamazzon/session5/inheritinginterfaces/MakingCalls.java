package com.andreamazzon.session5.inheritinginterfaces;

/**
 * This class illustrates how to work with multiple inheritance of interfaces,
 * and how polymorphism works in this case.
 *
 * @author Andrea Mazzon
 *
 */
public class MakingCalls {

	/**
	 * @param first, object of a class implementing FirstInterface. Note that it can
	 *               also take objects of classes implementing InheritingInterface:
	 *               it makes sense, because they also can call firstMethod().
	 */
	public static void callerToFirstInterface(FirstInterface first) {
		first.firstMethod();
	}

	/**
	 * @param second, object of a class implementing SecondInterface. Note that it
	 *                can also take objects of classes implementing
	 *                InheritingInterface: it makes sense, because they also can
	 *                call secondMethod().
	 */
	public static void callerToSecondInterface(SecondInterface second) {
		second.secondMethod();
	}

	/**
	 * @param inherit, object of a class implementing InheritingInterface: it has to
	 *                 able to call all the three methods.
	 */
	public static void callerToInheritingInterface(InheritingInterface inherit) {
		inherit.thirdMethod();
		inherit.firstMethod();
		inherit.secondMethod();
	}

	/**
	 * @param f, object of the class FirstClass. Note: it can also take an object of
	 *           LastClass, which extends FirstClass.
	 */
	public static void callerToFirstClass(FirstClass f) {
		f.aClassMethod();
	}

	public static void main(String[] args) {
		InheritingAndImplementingClass inheritingAndImplementingClass = new InheritingAndImplementingClass();
		// note how last gets implicitly upcasted everytime
		callerToFirstInterface(inheritingAndImplementingClass);
		System.out.println();
		callerToSecondInterface(inheritingAndImplementingClass);
		System.out.println();
		callerToInheritingInterface(inheritingAndImplementingClass);
		System.out.println();
		callerToFirstClass(inheritingAndImplementingClass);
		System.out.println();
		ClassImplementingFirstInterface firstInterfaceObject = new ClassImplementingFirstInterface();
		callerToFirstInterface(firstInterfaceObject);
		// callerToSecondInterface(firstInterfaceObject);FAIL!
		// callerToInheritingInterface(firstInterfaceObject);FAIL!

	}
}
