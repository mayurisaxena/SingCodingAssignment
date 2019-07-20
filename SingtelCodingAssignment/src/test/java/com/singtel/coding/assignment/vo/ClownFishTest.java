package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignment.constants.ActivityConstants;
import com.singtel.coding.assignment.helper.SystemOutResource;

public class ClownFishTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testSwim() {
		ClownFish clownFish = new ClownFish();
		clownFish.swim();
		assertThat(sysOut.asString(), containsString(ActivityConstants.I_AM_SWIMMING));
	}

}
