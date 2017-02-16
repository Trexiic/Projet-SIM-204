package projectiles;

public class Sphere  implements ModeleProjectiles{
	public static final float COEFFICIENT = 0.47f;
	private int rayon;
	private int masse;
	private double masseVolumique;

	public Sphere() {
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
