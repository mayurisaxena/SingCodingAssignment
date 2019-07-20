package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Fly;
import com.singtel.coding.assignment.activity.Sing;

public class Bird extends Animal implements Fly, Sing {

	public Bird() {
		this.setCanFly(true);
		this.setCanSing(true);
	}

	public void fly() {
		Fly.super.fly(this.isCanFly());
	}

	public void sing() {
		Sing.super.sing(this.isCanSing());
	}

}
