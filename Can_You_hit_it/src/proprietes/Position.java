package proprietes;

import javafx.beans.property.DoubleProperty;

public class Position {
	private DoubleProperty positionPropertyX;
	private DoubleProperty positionPropertyY;
	private Vitesse vitesse = null;

	public Position(double pVitesseX, double pVitesseY, Vitesse pVitesse) {
		// TODO Auto-generated constructor stub
	}

	public void calculerNouvellesVitesses() {

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
