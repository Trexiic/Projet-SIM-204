package lanceurs;

public class Ressort implements ModeleLanceurs {
	private double positionX = 0;
	private double positionY = 0;
	private double angle = 0;
	private double k = 1;
	private double etirement = 0;
	private double masseProjectile = 0;

	private final double POSITION_MAX = 300;
	private final double POSITION_MIN = 0;
	private final double ANGLE_MAX = 90;
	private final double ANGLE_MIN = 0;
	private final double RAPPEL_MAX = 1000;
	private final double RAPPEL_MIN = 0;
	private final double ETIREMENT_MAX = 5;
	private final double ETIREMENT_MIN = 0;

	/**
	 * Lanceur permettant l'utilisation des formules de l'�nergie.
	 * 
	 * @param pAngle
	 * @param pEtirment
	 * @param pEnergie
	 * @param pK
	 * @param pPositionX
	 * @param pPositionY
	 */
	public Ressort(double pAngle, double pEtirement, double pEnergie, double pK, double pPositionX, double pPositionY,
			double pMasseProjectile) {
		if (validerAngle(pAngle) && validerPosition(pPositionX, pPositionY) && validerRappel(pK)
				&& validerEtirement(pEtirement)) {
			angle = pAngle;
			positionX = pPositionX;
			positionY = pPositionY;
			k = pK;
			etirement = pEtirement;
			masseProjectile = pMasseProjectile;
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
	 * Valide la constante de rappel entre 0 exclus et 1000 exclus N/m
	 * 
	 * @param rappel
	 * @return
	 */
	private boolean validerRappel(double rappel) {
		boolean retour = false;
		if (rappel <= RAPPEL_MAX && rappel > RAPPEL_MIN) {
			retour = true;
		}

		return retour;
	}

	/**
	 * Valide l'étirement entre 0 et 5 m inclus
	 * 
	 * @param etirement
	 * @return
	 */
	private boolean validerEtirement(double etirement) {
		boolean retour = false;

		if (etirement <= ETIREMENT_MAX && etirement >= ETIREMENT_MIN) {
			retour = true;
		}

		return retour;
	}

	private double calculerVitesse() {
		return Math.sqrt((k * Math.pow(etirement, 2)) / masseProjectile);
	}

	/**
	 * Utilise la loi des sin pour trouver la vitesse initiale du projectile en
	 * X
	 */
	@Override
	public double getVitesseDeLancementX() {
		return calculerVitesse() * Math.sin(Math.toRadians(90) - Math.toRadians(angle));
	}

	/**
	 * Utilise la loi des sin pour trouver la vitesse initiale du projectile en
	 * Y
	 */
	@Override
	public double getVitesseDeLancementY() {
		return calculerVitesse() * Math.sin(Math.toRadians(angle));
	}

	/**
	 * Retourne la position du canon a ressort en X
	 */
	@Override
	public double getPositionDeLancementX() {
		return positionX;
	}

	/**
	 * Retourne la position du canon a ressort en Y
	 */
	@Override
	public double getPositionDeLancementY() {
		return positionY;
	}

}
