package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Fly;
import com.singtel.coding.assignment.activity.Sing;

public class Bird extends Animal implements Fly, Sing {

	public Bird() {
		this.setCanFly(true);
		this.setCanSing(true);
	}

}
