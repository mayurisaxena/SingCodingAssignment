package com.singtel.coding.assignment.helper;

import java.lang.reflect.Field;

import com.singtel.coding.assignment.constants.VariableConstants;
import com.singtel.coding.assignment.vo.Animal;

public class CountAnimalType {

	public static int countWalkingAnimals(Animal[] animals) throws IllegalAccessException {
		Integer cntWalk = 0;
		for (Animal animal : animals) {
			Field[] fields = animal.getClass().getSuperclass().getDeclaredFields();
			if (fields == null || fields.length == 0) {
				fields = animal.getClass().getSuperclass().getSuperclass().getDeclaredFields();
			}
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getName().equals(VariableConstants.CAN_WALK)) {
					boolean value = (Boolean) field.get(animal);
					if (value) {
						cntWalk++;
					}
				}
			}
		}
		return cntWalk;
	}

	public static int countFlyingAnimals(Animal[] animals) throws IllegalAccessException {
		Integer cntFly = 0;
		for (Animal animal : animals) {
			Field[] fields = animal.getClass().getSuperclass().getDeclaredFields();
			if (fields == null || fields.length == 0) {
				fields = animal.getClass().getSuperclass().getSuperclass().getDeclaredFields();
			}
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getName().equals(VariableConstants.CAN_FLY)) {
					boolean value = (Boolean) field.get(animal);
					if (value) {
						cntFly++;
					}
				}
			}
		}
		return cntFly;
	}

	public static int countSingingAnimals(Animal[] animals) throws IllegalAccessException {
		Integer cntSing = 0;
		for (Animal animal : animals) {
			Field[] fields = animal.getClass().getSuperclass().getDeclaredFields();
			if (fields == null || fields.length == 0) {
				fields = animal.getClass().getSuperclass().getSuperclass().getDeclaredFields();
			}
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getName().equals(VariableConstants.CAN_SING)) {
					boolean value = (Boolean) field.get(animal);
					if (value) {
						cntSing++;
					}
				}
			}
		}
		return cntSing;
	}

	public static int countSwimingAnimals(Animal[] animals) throws IllegalAccessException {
		Integer cntSwim = 0;
		for (Animal animal : animals) {
			Field[] fields = animal.getClass().getSuperclass().getDeclaredFields();
			if (fields == null || fields.length == 0) {
				fields = animal.getClass().getSuperclass().getSuperclass().getDeclaredFields();
			}
			for (Field field : fields) {
				field.setAccessible(true);
				if (field.getName().equals(VariableConstants.CAN_SWIM)) {
					boolean value = (Boolean) field.get(animal);
					if (value) {
						cntSwim++;
					}
				}
			}
		}
		return cntSwim;
	}

}
