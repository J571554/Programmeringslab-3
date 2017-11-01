package java_programering_3;

import static javax.swing.JOptionPane.*;

public class Oppgave_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int ti = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int o = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int to = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int f = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int l = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int s = Integer.parseInt(showInputDialog("Skriv temperaturen for dagen: "));
		int[] tempTab = { m, ti, o, to, f, l, s };
		final int DAGER = tempTab.length;
		System.out.println("Analyse av temperaturer");
		System.out.println("***********************");
		System.out.println("Skriv inn temperaturene:");
		for (int i = 0; i < DAGER; i++) {
			System.out.println(i + 1 + ". dag: " + tempTab[i]);
		}

		int gjen = (m + ti + o + to + f + l + s) / DAGER;
		System.out.println("Gjennomsnittstemperaturen var " + gjen);
		int max = 1;
		for (int k = 0; k < DAGER; k++) {
			if (max < tempTab[k]) {
				max = tempTab[k];
			}
		}
		System.out.println("Maxtemperaturen for denne uken var " + max);
	}

}
