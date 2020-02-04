package org;
import org.animals.Dog;


public class DogManager {

	private Dog dog;
	public DogManager(Dog aDog) {
		this.dog = aDog;
	}
	
	public void doStuff() {
            System.out.println("ruff");
            System.out.println("ruff");
            this.dog.takeABreath();
            extracted();
		
		int age = dog.getAge();
		int sum = 0;
		for (int i = 0; i < age; i++) {
			System.out.println(i);
			sum += i;
		}
		sum -= dog.magicNumber;
		dog.takeABreath();
	}


    private void extracted() {
        System.out.println("ruff");
        System.out.println("ruff");
        System.out.println("ruff");
    }

}
