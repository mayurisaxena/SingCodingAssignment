package com.singtel.coding.assignment.vo;

public class Fish extends Animal {

	private String size;
	private String color;
	private String specialFeature;

	public Fish() {
		this.setCanSing(false);
		this.setCanWalk(false);
		this.setCanSwim(true);
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	@Override
	public String toString() {
		return "Fish [size=" + size + ", color=" + color + ", specialFeature=" + specialFeature + "]";
	}

}
