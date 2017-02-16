package proprietes;

import forces.FrottementDeLAir;

public class Acceleration {
	private double gravite = 0;
	private double accelerationX;
	private double accelerationY;
	private FrottementDeLAir fDL = null;

	public Acceleration(double pAccelerationX, double pAccelerationY, double pGravite, FrottementDeLAir pFDL) {
		// TODO Auto-generated constructor stub
	}

	public void calculerNouvellesAccelerations() {

	}

	private double getAccelerationX() {
		return accelerationX;
	}

	public void setAccelerationX(double accelerationX) {
		this.accelerationX = accelerationX;
	}

	public double getAccelerationY() {
		return accelerationY;
	}

	private void setAccelerationY(double accelerationY) {
		this.accelerationY = accelerationY;
	}

}
