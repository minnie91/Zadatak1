package glavniPaket;

public class Pravougaonik implements Figura {
	private double sirina;
	private double visina;
	
	public Pravougaonik() {
		super();
	}

	public Pravougaonik(double sirina, double visina) {
		super();
		this.sirina = sirina;
		this.visina = visina;
	}

	public double getSirina() {
		return sirina;
	}

	public void setSirina(double sirina) {
		this.sirina = sirina;
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}
	
	public double getO() {
		return (2*getSirina())+(2*getVisina());
	}
	
	public double getP() {
		return getVisina()*getSirina();
	}

	@Override
	public String toString() {
		return "Pravougaonik [sirina=" + getSirina() + ", visina=" + getVisina() + "]";
	}
	
	

}
