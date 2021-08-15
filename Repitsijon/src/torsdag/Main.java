package torsdag;

public class Main {
	public static void main(String[] args) {
		/*
		 * Forventer denne utskriften:
		 * 
		 * | A B C D ---+------------ A | . T T . B | T . . . C | T . . . D | . . . ...
		 * 
		 * Grafen har 2 kanter.
		 *
		 */
		String[] g1 = { "Anne", "Bj�rn", "Edvard", "Fiona" };
		Facebook gr1 = new Facebook("DAT102", g1);
		System.out.println(gr1.leggTilVenner("Anne", "Bj�rn"));

		System.out.println(gr1.g.getNavn()[0]);

		gr1.leggTilVenner("Anne", "Bj�rn");
		gr1.leggTilVenner("Anne", "Edvard");
		gr1.leggTilVenner("Edvard", "Fiona");
		gr1.leggTilVenner("Bj�rn", "Fiona");
		System.out.println();
		gr1.printUtF();
		System.out.println();
		// gr1.visGraf();

		System.out.println();
		System.out.println("antall kanter: " + gr1.g.getAntallKanter());
		System.out.println();
		System.out.println("liste av noder = " + gr1.g.alleNoder());
		System.out.println();
		System.out.println("Er Anne og Bj�rn venner ? " + gr1.erVenner("Anne", "Bj�rn"));
		System.out.println("Er Anne og Edvard venner ? " + gr1.erVenner("Anne", "Edvard"));
		System.out.println();
		System.out.println("Venner til Anne er " + gr1.g.getNaboer("Anne"));
		System.out.println();
		gr1.visGraf();

	}
}
