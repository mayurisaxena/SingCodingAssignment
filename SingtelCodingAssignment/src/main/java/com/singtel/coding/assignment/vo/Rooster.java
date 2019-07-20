package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Talk;
import com.singtel.coding.assignment.constants.SoundConstants;

public class Rooster extends Bird implements Talk{

	Chicken chicken;

	Rooster() {
		this.chicken = new Chicken();
		this.setCanFly(chicken.isCanFly());
	}

	public void talk() {
		Talk.super.talk(SoundConstants.ROOSTER);
	}

}
