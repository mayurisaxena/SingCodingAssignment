package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Talk;
import com.singtel.coding.assignment.constants.SoundConstants;

public class Duck extends Bird implements Talk {

	public Duck() {
		this.setCanSwim(true);
	}

	public void talk() {
		Talk.super.talk(SoundConstants.DUCK);
	}
}
