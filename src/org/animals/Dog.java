package org.animals;


import org.DogManager;

public class Dog {

	private int age = 0;
	public int magicNumber = 17;

	public int getAge() {
		return this.age;
	}

	public void doStuff(DogManager dogManager) {
		barkBark(this);

		int age = getAge();
		int sum = 0;
		for (int i = 0; i < age; i++) {
			System.out.println(i);
			sum += i;
		}
		sum -= magicNumber;
		System.out.println("...");
	}

	private void barkBark(Dog dog) {
		dog.age = 19;
		
	}
}
