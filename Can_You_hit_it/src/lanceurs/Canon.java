package lanceurs;

public class Canon implements ModeleLanceurs{
	private double positionX;
	private double positionY;
	private double angle;
	private double vitesse;

/**
 * Lanceur utilisant uniquement les formules classiques de projectile (Cinématique)
 * @param pAngle
 * @param pVitesse
 * @param pPositionX
 * @param pPositionY
 */
	public Canon(double pAngle, double pVitesse, double pPositionX, double pPositionY) {

	}

	private boolean validerAngle() {
		return true;
	}

	private boolean validerVitesse() {
		return true;
	}

	private boolean validerPositions() {
		return true;
	}

	@Override
	public double getVitesseDeLancementX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getVitesseDeLancementY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPositionDeLancementX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPositionDeLancementY() {
		// TODO Auto-generated method stub
		return 0;
	}
}
