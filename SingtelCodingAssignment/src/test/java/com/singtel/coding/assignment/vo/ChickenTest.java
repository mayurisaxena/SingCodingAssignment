package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignement.helper.SystemOutResource;
import com.singtel.coding.assignment.constants.ActivityConstants;
import com.singtel.coding.assignment.constants.SoundConstants;

public class ChickenTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testTalk() {
		Chicken chicken = new Chicken();
		chicken.talk();
		assertThat(sysOut.asString(), containsString("I say "+ SoundConstants.CHICKEN));
	}

	@Test
	public void testFly() {
		Chicken chicken = new Chicken();
		chicken.fly();
		assertThat(sysOut.asString(), containsString(ActivityConstants.I_CANNOT_FLY));
	}

}
