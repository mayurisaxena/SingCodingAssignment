package com.singtel.coding.assignment.main;

import com.singtel.coding.assignement.helper.CountAnimalType;
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
import com.singtel.coding.assignment.vo.Rooster;
import com.singtel.coding.assignment.vo.Shark;

/**
 * Solution for Assignemnt
 *
 * @author mayuri.a.saxena
 *
 */
public class Solution {

	public static void main(String[] args) throws IllegalAccessException {
		Bird bird = new Bird();
		bird.fly();
		bird.sing();

		Animal[] animals = new Animal[] { new Bird(), new Duck(), new Chicken(), new Rooster(), new Parrot("Dog"),
				new Fish(), new Shark(), new ClownFish(), new Dolphin(), new Frog(), new Dog(), new Butterfly(),
				new Cat() };

		System.out.println("Walk Count " + CountAnimalType.countWalkingAnimals(animals));
		System.out.println("Sing Count " + CountAnimalType.countSingingAnimals(animals));
		System.out.println("Fly Count " + CountAnimalType.countFlyingAnimals(animals));
		System.out.println("Swim Count " + CountAnimalType.countSwimingAnimals(animals));

	}

}
