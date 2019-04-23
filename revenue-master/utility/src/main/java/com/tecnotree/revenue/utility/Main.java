package com.tecnotree.revenue.utility;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		System.out.println("web");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		System.out.println(Builder.build(Properties.class)
				  .with(p -> p.put("one", 1))
				  .If(() -> false)// any expression returning boolean
				  .with(p -> p.put("two", 2))
				  .with(p -> p.put("three", 3))
				  .endIf()
				  .with(p -> p.put("four", 4))
				  .get());
	}

}
