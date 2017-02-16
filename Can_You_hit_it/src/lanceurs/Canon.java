package lanceurs;

public class Canon implements ModeleLanceurs {

	private double positionX = 0;
	private double positionY = 0;
	private double angle = 0;
	private double vitesse = 0;

	private final double POSITION_MAX = 300;
	private final double POSITION_MIN = 0;
	private final double ANGLE_MAX = 90;
	private final double ANGLE_MIN = 0;
	private final double VITESSE_MAX = 1000;
	private final double VITESSE_MIN = 0;

	/**
	 * Lanceur utilisant uniquement les formules classiques de projectile
	 * (Cinématique)
	 * 
	 * @param pAngle
	 * @param pVitesse
	 * @param pPositionX
	 * @param pPositionY
	 */
	public Canon(double pAngle, double pVitesse, double pPositionX, double pPositionY) {
		if (validerAngle(pAngle) && validerPosition(pPositionX, pPositionY) && validerVitesse(pVitesse)) {
			angle = pAngle;
			positionX = pPositionX;
			positionY = pPositionY;
			vitesse = pVitesse;
		} else {
			// TODO Boite de dialogue d'invalidité
		}
	}

	/**
	 * Valide l'angle entre 0 inclus et 90 exclus
	 * 
	 * @param angle
	 * @return
	 */
	private boolean validerAngle(double angle) {
		boolean retour = false;

		if (angle < ANGLE_MAX && angle >= ANGLE_MIN) {
			retour = true;
		}

		return retour;
	}

	/**
	 * Valide la vitesse entre 0 et 1000 m/s inclus
	 * 
	 * @param vitesse
	 * @return
	 */
	private boolean validerVitesse(double vitesse) {
		boolean retour = false;

		if (vitesse <= VITESSE_MAX && vitesse >= VITESSE_MIN) {
			retour = true;
		}

		return retour;
	}

	/**
	 * Valide la position entre 0 et 300 m inclus
	 * 
	 * @param posX
	 * @param posY
	 * @return
	 */
	private boolean validerPosition(double posX, double posY) {
		boolean retour = false;
		if (posX <= POSITION_MAX && posX >= POSITION_MIN && posY <= POSITION_MAX && posY >= POSITION_MIN) {
			retour = true;
		}

		return retour;
	}

	/**
	 * Utilise la loi des sin pour trouver la vitesse initiale du projectile en
	 * X
	 */
	@Override
	public double getVitesseDeLancementX() {
		return vitesse * Math.sin(Math.toRadians(90) - Math.toRadians(angle));
	}

	/**
	 * Utilise la loi des sin pour trouver la vitesse initiale du projectile en
	 * Y
	 */
	@Override
	public double getVitesseDeLancementY() {
		return vitesse * Math.sin(Math.toRadians(angle));
	}

	/**
	 * Retourne la position du canon en X
	 */
	@Override
	public double getPositionDeLancementX() {
		return positionX;
	}

	/**
	 * Retourne la position du canon en Y
	 */
	@Override
	public double getPositionDeLancementY() {
		return positionY;
	}
}
