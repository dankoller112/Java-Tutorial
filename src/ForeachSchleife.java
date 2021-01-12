
public class ForeachSchleife {

	public static void main(String[] args) {
		// Schleifentyp, um bsow. Arrays schrittweise zu durchlaufen
		// Speichert bei jedem Durchlauf eine *Kopie* des aktuellen Wertes der Datenstruktur in einer Variable
		// Nur lesender Zugriff auf o. g. Variable (Kopie des Werts)
		
		/*
		String[] names = new String[3];
		
		names[0] = "Daniel";
		names[1] = "Linda";
		names[3] = "Robert";
		
		System.out.println(names[1]);
		*/
		
		// Im Vergleich zu "normaler" Array (s. o.) Schreibweise, hier Kurzform
		// Dann sinnvoll, wenn Werte bereits vornherein in Reihenfolge bestimmt
		// Länge wird dadurch automatisch definiert (i. V. m. ".length" Attribut)
		String[] names = {"Daniel", "Linda", "Robert"};
		
		// For Schleife
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		
		// Foreach Schleife (nur für Datenstrukturen anwendbar)
		// Syntax: for(*TYP* *BEZEICHNER (= Variable)* : *ARRAY (= hier "names")*
		for(String name : names) {
			System.out.println(name);
		}

	}

}
