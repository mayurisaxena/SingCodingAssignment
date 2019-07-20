package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Fly;
import com.singtel.coding.assignment.activity.Sing;
import com.singtel.coding.assignment.activity.Swim;
import com.singtel.coding.assignment.activity.Walk;

public class Animal implements Walk, Swim,  Fly, Sing {

	private boolean canFly = false;
	private boolean canSing = false;
	private boolean canSwim = false;
	private boolean canWalk = true;

	public void walk() {
		Walk.super.walk(canWalk);
	}

	public void swim() {
		Swim.super.swim(canSwim);
	}

	public void fly() {
		Fly.super.fly(canFly);
	}

	public void sing() {
		Sing.super.sing(canSing);
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isCanSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

}
