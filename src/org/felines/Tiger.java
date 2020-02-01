package org.felines;



public class Tiger extends Feline implements Animal{

    /**
     * @return the force
     */
    public int getForce() {
        return force;
    }

    /**
     * @param force the force to set
     */
    public void setForce(int force) {
        this.force = force;
    }

	private int speed;
        private int force;

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	

}
