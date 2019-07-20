package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignment.constants.ActivityConstants;
import com.singtel.coding.assignment.constants.SoundConstants;
import com.singtel.coding.assignment.helper.SystemOutResource;

public class DuckTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testTalk() {
		Duck duck = new Duck();
		duck.talk();
		assertThat(sysOut.asString(), containsString("I say " + SoundConstants.DUCK));
	}

	@Test
	public void testSwim() {
		Duck duck = new Duck();
		duck.swim();
		assertThat(sysOut.asString(), containsString(ActivityConstants.I_AM_SWIMMING));
	}

}
