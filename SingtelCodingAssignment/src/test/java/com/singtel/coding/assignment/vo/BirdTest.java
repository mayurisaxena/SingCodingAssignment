package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignment.constants.ActivityConstants;
import com.singtel.coding.assignment.helper.SystemOutResource;

public class BirdTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testFly() {
		Bird bird = new Bird();
		bird.fly();
		assertThat(sysOut.asString(), containsString(ActivityConstants.I_AM_FLYING));
	}

	@Test
	public void testSing() {
		Bird bird = new Bird();
		bird.sing();
		assertThat(sysOut.asString(), containsString(ActivityConstants.I_AM_SINGING));
	}

}
