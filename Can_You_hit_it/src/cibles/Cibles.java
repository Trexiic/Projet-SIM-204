package cibles;

import javafx.beans.property.DoubleProperty;

public class Cibles {
	private double rayon;
	private double orientation;
	private double vitesseX;
	private double vitesseY;
	private DoubleProperty positionPropertyX;
	private DoubleProperty positionPropertyY;

	public Cibles(double pX, double pY, double pRayon, double pOrientation, double pVitesse) {

	}

	public boolean validerVitesses() {
		return false;
	}

	public boolean validerPositions() {
		return false;
	}

	public double[] positions() {
		return null;
	}

	public boolean validerOrientation() {
		return false;
	}

	public double getX() {
		return positionPropertyX.get();
	}

	public double getY() {
		return positionPropertyY.get();
	}

	public DoubleProperty getPositionPropertyX() {
		return positionPropertyX;
	}

	public void setPositionPropertyX(double positionX) {
		positionPropertyX.set(positionX);
	}

	public DoubleProperty getPositionPropertyY() {
		return positionPropertyY;
	}

	public void setPositionPropertyY(double positionY) {
	}

}
