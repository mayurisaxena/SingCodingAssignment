package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignement.helper.SystemOutResource;
import com.singtel.coding.assignment.constants.SoundConstants;

public class ParrotTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testTalkDog() {
		Parrot parrot = new Parrot("Dog");
		parrot.talk();
		assertThat(sysOut.asString(), containsString("I say "+ SoundConstants.DOG));
	}

	@Test
	public void testTalkCat() {
		Parrot parrot = new Parrot("Cat");
		parrot.talk();
		assertThat(sysOut.asString(), containsString("I say "+ SoundConstants.CAT));
	}

}
