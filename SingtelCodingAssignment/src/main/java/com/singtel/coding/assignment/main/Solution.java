package com.singtel.coding.assignment.main;

import com.singtel.coding.assignment.vo.Bird;

/**
 * Solution for Assignemnt
 *
 * @author mayuri.a.saxena
 *
 */
public class Solution {
	private Solution() {
	}

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

}
