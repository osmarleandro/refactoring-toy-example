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
        dogManager.dog.takeABreath();
        dogManager.renameMethod();
        int age = dogManager.dog.getAge();
        int sum = 0;
        for (int i = 0; i < age; i++) {
            System.out.println(i);
            sum += i;
        }
        sum -= dogManager.dog.magicNumber;
        dogManager.dog.takeABreath();
    }

}
