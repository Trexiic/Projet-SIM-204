package obstacles;

public enum Gravite {
	TERRE(9.807), MARS(3.711), LUNE(1.622), Jupitere(24.79);
	private double valeur = 0;

	private Gravite(double pValeur) {
		valeur = pValeur;
	}

	public double getValeur() {
		return valeur;
	}
}
