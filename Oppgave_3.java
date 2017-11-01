package java_programering_3;

import static javax.swing.JOptionPane.showInputDialog;



public class Oppgave_3 {
	
	public static void main(String[] arg) {
		int j = Integer.parseInt(showInputDialog("Skriv inn antall ord: "));
		String[] tabell = new String [j];
		for(int i = 0; i < j; i++) {
			String ord = (showInputDialog("Skriv inn ord"));
			tabell[i] = ord;
			System.out.print(tabell[i] + ", ");
		}
		System.out.println("");
		
		String møn = showInputDialog("Skriv mønsteret: ");
		int likhet = 0;
		for(int a = 0; a < j; a++) {
			if(tabell[a].contains(møn)) {
				likhet = likhet + 1;
				System.out.print(tabell[a] + " ");
			}
			
		}
		System.out.println("total likhet er: " + likhet);
		
		for(int t = 0; t < j; t++) {
			int f = tabell[t].length();
			String ord = tabell[t];
			if(f == 1) {
				System.out.print(ord);
			} else if (f%2 == 0) {
				System.out.print(ord.substring((f/2)-1, (f/2)+1));
				
			} else if (f%2 == 1) {
				System.out.print(ord.substring(((f-1)/2)-1, ((f-1)/2)+2));
			}
			System.out.println("");
		}
	}

}
