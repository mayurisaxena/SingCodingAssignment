package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Talk;
import com.singtel.coding.assignment.constants.SoundConstants;

public class Cat extends Animal implements Talk{

	public Cat() {
		this.setCanFly(false);
		this.setCanWalk(true);
	}

	public void talk() {
		Talk.super.talk(SoundConstants.CAT);
	}
}
