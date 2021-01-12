
public class Klassen {

	public static void main(String[] args) {
		/*
		 * Klassen sind "Baupläne" für Objekte
		 * 
		 * - Definieren zwei Dinge:
		 * 	> Welche Eigenschaften/Attribute hat ein Objekt
		 * 	> Welche Methoden kann ein Objekt ausführen
		 * 
		 * - Von einer Klasse können Objekte erzeugt werden
		 * 	> Jedes Objekt hat eigene Attribute & kann seine Methoden selbstständig ausführen
		 */
		
		/*
		 *  Es ist üblich, dass jede Klasse eines Programm über ein eigenes File verfügt
		 *  Das zu diesem Beispiel zugehörige File lautet "Computer" (Anfangsbuchstaben immer groß)
		 */
		
		// Instanziieren eines Objekt(aus "Computer"):
		Computer comp1 = new Computer("silver", "Apple", 128); // = Standardkonstruktor der Klasse "Computer", wenn eigener erzeugt (s. "Computer"), dann müssen Parameter direkt übergeben werden.
		Computer comp2 = new Computer(); // Überladen
		/*
		 * comp1.running();
		 * comp1.setColor("spacegrey");
		 */
		System.out.println(comp1.getBrand() + " MacBook Pro");
		System.out.println("Farbe: " + comp1.getColor());
		System.out.println("Speicherplatz: " + comp1.getMemory() + " GB");
		comp1.running();
		comp2.running("einwandfrei");
		// Durch den Konstruktor werden die Parameter direkt übergeben, ein "set" ist somit nicht notwendig
		// Der Konstruktor empfiehlt sich, wenn Werte feststehen, die direkt bei Aufruf ausgeführt werden sollen
		
	}

}
