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
		String[] g1 = { "A", "B", "C", "D" };
		Facebook gr1 = new Facebook("DAT102", g1);
		System.out.println(gr1.leggTilVenner("A", "B"));

		System.out.println(gr1.g.getNavn()[0]);

		gr1.leggTilVenner("A", "B");
		gr1.leggTilVenner("A", "C");
		gr1.leggTilVenner("C", "D");
		gr1.leggTilVenner("B", "E");
		System.out.println();
		gr1.printUtF();
		System.out.println();
		// gr1.visGraf();

		System.out.println();
		System.out.println("antall kanter: " + gr1.g.getAntallKanter());
		System.out.println();
		System.out.println("liste av noder = " + gr1.g.alleNoder());
		System.out.println();
		System.out.println("Er A og B venner ? " + gr1.erVenner("A", "B"));
		System.out.println("Er A og B venner ? " + gr1.erVenner("A", "C"));
		System.out.println();
		System.out.println("Venner ril A er " + gr1.g.getNaboer("A"));

	}
}
