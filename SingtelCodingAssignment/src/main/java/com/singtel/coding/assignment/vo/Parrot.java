package com.singtel.coding.assignment.vo;

import com.singtel.coding.assignment.activity.Talk;
import com.singtel.coding.assignment.constants.SoundConstants;

public class Parrot extends Bird implements Talk {

	String voice;

	public Parrot(String coAnimal) {
		if ("Dog".equals(coAnimal))
			this.voice = SoundConstants.DOG;
		else if ("Cat".equals(coAnimal))
			this.voice = SoundConstants.CAT;
		else if ("Rooster".equals(coAnimal))
			this.voice = SoundConstants.ROOSTER;
	}

	public void talk() {
		Talk.super.talk(voice);
	}

}
