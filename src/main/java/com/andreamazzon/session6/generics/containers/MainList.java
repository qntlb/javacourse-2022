package com.andreamazzon.session6.generics.containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainList {

	public static void main(String[] args) {
		List<Double> original = Arrays.asList(1.0, 2.0, 3.0);

		// Clone the list
		List<Double> cloned_list = new ArrayList<Double>(original);

		System.out.println(cloned_list);

		List<Double> cloned_list2 = new ArrayList<Double>();

		// Cloning a list
		cloned_list2.addAll(original);

		System.out.println(cloned_list2);

		List<Double> cloned_list3 = original.stream().collect(Collectors.toList());

		System.out.println(cloned_list3);
	}

}
