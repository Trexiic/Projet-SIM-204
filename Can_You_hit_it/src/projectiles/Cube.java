package projectiles;

public class Cube implements ModeleProjectiles{
	public static final float COEFFICIENT = 1.05f;
	private int hauteur;
	private int largeur;
	private int profondeur;
	private int masse;
	private double masseVolumique;

	public Cube() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSurfaceFrottement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getCoefficient() {
		// TODO Auto-generated method stub
		return 0;
	}

}
