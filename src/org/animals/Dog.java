package org.animals;

import org.DogManager;

public class Dog {

	private int age = 0;
	public int magicNumber = 17;

	public int getAge() {
		return this.age;
	}

	public void takeABreath() {
		System.out.println("...");
	}

	public void doStuff(DogManager dogManager) {
		System.out.println("ruff");
		System.out.println("ruff");
		takeABreath();
		dogManager.renameMehod();
		
		int age = getAge();
		int sum = 0;
		for (int i = 0; i < age; i++) {
			System.out.println(i);
			sum += i;
		}
		sum -= magicNumber;
		takeABreath();
	}

	private void barkBark(Dog dog) {
		dog.age = 19;
	}
}
