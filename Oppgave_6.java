package java_programering_2;

import static javax.swing.JOptionPane.*;

public class Oppgave_6 {

	public static void main(String[] arg) {
		int b = Integer.parseInt(showInputDialog("Skriv inn antall eksamener: "));
		for (int c = b; c > 0; c = c - 1) {
			Karakter();
		}
	}

	public static void Karakter() {

		int x = Integer.parseInt(showInputDialog("Skriv inn poengsum: "));

		if (x > 100 || x < 0) {
			System.out.println("Feil verdi på en eksamen");
			int y = Integer.parseInt(showInputDialog("Skriv inn en ekte poengsum mellom 0 og 100: "));
			x = y;
		}

		if (x <= 39) {
			System.out.println("Eleven fikk karakteren F, og strøk");
		} else if (x <= 49) {
			System.out.println("Eleven fikk karakteren E, og passerte");
		} else if (x <= 59) {
			System.out.println("Eleven fikk karakteren D, og passerte");
		} else if (x <= 79) {
			System.out.println("Eleven fikk karakteren C, og passerte");
		} else if (x <= 89) {
			System.out.println("Eleven fikk karakteren B, og passerte");
		} else if (x <= 100) {
			System.out.println("Eleven fikk karakteren A, og passerte");
		}
	}

}
