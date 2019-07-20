package com.singtel.coding.assignment.vo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignement.helper.SystemOutResource;

public class BirdTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testFly() {
		Bird bird = new Bird();
		bird.fly();
		assertThat(sysOut.asString(), containsString("I am flying"));
	}

	@Test
	public void testSing() {
		Bird bird = new Bird();
		bird.sing();
		assertThat(sysOut.asString(), containsString("I am singing"));
	}

}
