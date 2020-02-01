package org.felines;



public class Tiger extends Feline implements Animal{

	private int speed;
	private int force;

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}
