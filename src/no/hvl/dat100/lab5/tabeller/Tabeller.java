package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static void main(String[] args) {

		int[] a = { 1, 4, 6, 1, 72, 603, 3, 29, 0, 42 };
		int[] b = { 938, 48, 387, 482, 92, 28 };
		int[] c = { 938, 48, 387, 482, 92, 28 };
		int[] d = {};

	}

	// a)
	public static void skrivUt(int[] tabell) {

		// TODO
		for (int tall: tabell) {
			System.out.print(tall + " ");
		}
		System.out.print("");
	}


	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
		if (tabell.length == 0) {
			return "[]";
		}
		String text = "[";
		for (int i = 0; i < tabell.length; i++) {
			text += tabell[i] + ",";
		}
	// Sletter det siste tegnet i strengen.
	text = text.substring(0, text.length() - 1);
	text += "]";
	return text;
	}


	// c)
	public static int summer(int[] tabell) {

		// TODO
		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}


	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		for (int tabelltall: tabell) {
			if (tabelltall == tall) {
				return true;
			}
		}
		return false;
	}


	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}


	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length - 1 - i];
		}
		return nyTabell;
	}


	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i-1]) {
				return false;
			}
		}
		return true;
	}


	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		int[] nyTabell = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[i + tabell1.length] = tabell2[i];
		}
		return nyTabell;
	}
}
