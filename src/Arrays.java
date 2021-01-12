
public class Arrays {

	public static void main(String[] args) {
		// Arrays sind Datenstrukturen (Datensammlungen)
		// Arryas sind wie Variablen, die mehrere Werte beinhalten können
		// Zugriff auf die einzelnen Werte erfolgt über einen Index
		
		// Arrays werden deklariert, indem neben den Datentyp "[]" folgt
		// Anschließend erfolgt das Schlüsselwort "new"
		// Arrays haben eine feste Länge; die Größe wird bei der Initialisierung festgelegt (hier 3)
		
		String[] names = new String[3];
		
		names[0] = "Daniel";
		names[1] = "Linda";
		names[2] = "Robert";
		
		/*
		System.out.println(names[1]);
		*/
		
		// ".length" ist eine Attribut der Klasse "String"
		// Die Länge des Arrays wird dadurch automatisch angepasst
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

	}

}
