package org;
import org.animals.Dog;


public class DogManager {
	
	private String _name =  "Totó"; 

	public Dog dog;
	public DogManager(Dog aDog) {
		this.dog = aDog;
	}
	
	public void renameMehod() {
		System.out.println("ruff");
		System.out.println("ruff");
		System.out.println("ruff");
	}
	
	public String get_name() {
		return _name;
	}

}
