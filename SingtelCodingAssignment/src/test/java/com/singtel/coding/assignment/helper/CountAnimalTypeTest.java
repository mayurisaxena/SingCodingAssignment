package com.singtel.coding.assignment.helper;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;

import com.singtel.coding.assignement.helper.CountAnimalType;
import com.singtel.coding.assignement.helper.SystemOutResource;
import com.singtel.coding.assignment.main.Solution;
import com.singtel.coding.assignment.vo.Animal;
import com.singtel.coding.assignment.vo.Bird;
import com.singtel.coding.assignment.vo.Butterfly;
import com.singtel.coding.assignment.vo.Cat;
import com.singtel.coding.assignment.vo.Chicken;
import com.singtel.coding.assignment.vo.ClownFish;
import com.singtel.coding.assignment.vo.Dog;
import com.singtel.coding.assignment.vo.Dolphin;
import com.singtel.coding.assignment.vo.Duck;
import com.singtel.coding.assignment.vo.Fish;
import com.singtel.coding.assignment.vo.Frog;
import com.singtel.coding.assignment.vo.Parrot;
import com.singtel.coding.assignment.vo.Shark;

public class CountAnimalTypeTest {

	@Rule
	public SystemOutResource sysOut = new SystemOutResource();

	@Test
	public void testFlyCount() throws IllegalAccessException {
		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Parrot("Dog"), new Fish(), new Shark(),
				new ClownFish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(), new Cat() };
		assertEquals(4, CountAnimalType.countFlyingAnimals(animals));
	}

}
