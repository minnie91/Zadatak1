package glavniPaket;

public class Program {

	public static void main(String[] args) {
		Pravougaonik p = new Pravougaonik(5,8);
		Krug k1 = new Krug(4);
		
		System.out.println("Povrsina pravougaonika je " + p.getP() +", a obim je " + p.getO()  );
		System.out.println("Povrsina kruga je " + k1.getP() +", a obim je " + k1.getO()  );

	}

}
