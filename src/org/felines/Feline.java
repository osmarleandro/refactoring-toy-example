package org.felines;

public class Feline implements Animal {

	private int age;
	public static final int name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getName() {
		return Feline.name;
	}
	public void setName(int name) {
		Feline.name = name;
	}
	
	public void meow() {
		System.out.println("meow");
	}
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}
	
	

}
