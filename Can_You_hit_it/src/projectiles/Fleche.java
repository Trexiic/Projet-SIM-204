package projectiles;

public class Fleche implements ModeleProjectiles{
	private static final float COEFFICIENT = 0.04f;
	private int rayon;
	private int masse;
	private double masseVolumique;

	public Fleche() {
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
