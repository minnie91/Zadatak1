package glavniPaket;

public class Krug implements Figura{
	private double poluprecnik;

	public Krug() {
		super();
	}

	public Krug(double poluprecnik) {
		super();
		this.poluprecnik = poluprecnik;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
	
	public double getO() {
		return 2*getPoluprecnik()*Math.PI;
	}
	
	public double getP() {
		return getPoluprecnik()*getPoluprecnik()*Math.PI;
	}

	@Override
	public String toString() {
		return "Krug [poluprecnik=" + getPoluprecnik() + "]";
	}
	
	

}
