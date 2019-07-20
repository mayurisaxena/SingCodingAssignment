package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignement.helper.SystemOutResource;
import com.singtel.coding.assignment.constants.ActivityConstants;

public class DolphinTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testSwim() {
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		assertThat(sysOut.asString(), containsString(ActivityConstants.I_AM_SWIMMING));
	}

}
