package com.singtel.coding.assignment.main;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignement.helper.SystemOutResource;


/**
 * Unit test for simple Solution.
 */
public class SolutionTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testSolution() throws IllegalAccessException {
		Solution.main(null);
		assertThat(sysOut.asString(), containsString("I am "));
	}
}
