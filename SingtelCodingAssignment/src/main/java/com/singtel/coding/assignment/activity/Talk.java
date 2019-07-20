package com.singtel.coding.assignment.activity;

public interface Talk {

	default void talk(String talk) {
		System.out.println("I say " + talk);
	}
}
