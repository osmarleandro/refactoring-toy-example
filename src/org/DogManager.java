package org;
import org.animals.Dog;


public class DogManager {
	
	private String _name =  "Totó"; 

	private Dog dog;
	public DogManager(Dog aDog) {
		this.dog = aDog;
	}

	private void renameMethod() {
		System.out.println("ruff");
		System.out.println("ruff");
		System.out.println("ruff");
	}
	
	public String get_name() {
		return _name;
	}

}
