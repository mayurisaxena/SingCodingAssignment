package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Fly;
import com.singtel.coding.assignment.activity.Talk;
import com.singtel.coding.assignment.constants.SoundConstants;

public class Chicken extends Bird implements Talk, Fly {

	public Chicken() {
		this.setCanFly(false);
	}

	public void talk() {
		Talk.super.talk(SoundConstants.CHICKEN);
	}

}
