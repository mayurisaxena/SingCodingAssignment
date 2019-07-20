package com.singtel.coding.assignment.main;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignment.helper.CountAnimalType;
import com.singtel.coding.assignment.helper.SystemOutResource;
import com.singtel.coding.assignment.vo.Animal;
import com.singtel.coding.assignment.vo.Bird;
import com.singtel.coding.assignment.vo.Butterfly;
import com.singtel.coding.assignment.vo.Cat;
import com.singtel.coding.assignment.vo.ClownFish;
import com.singtel.coding.assignment.vo.Dog;
import com.singtel.coding.assignment.vo.Dolphin;
import com.singtel.coding.assignment.vo.Duck;
import com.singtel.coding.assignment.vo.Fish;
import com.singtel.coding.assignment.vo.Frog;
import com.singtel.coding.assignment.vo.Parrot;
import com.singtel.coding.assignment.vo.Shark;


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
		assertThat(sysOut.asString(), containsString("Fly Count 4"));
	}
}
