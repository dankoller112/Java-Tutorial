
public class Vererbung {

	public static void main(String[] args) {
		/*
		 * Vererbung ermöglicht das Erweitern von Klassen, ohne diese direkt zu ändern
		 * 
		 * Prinzip: Man erstellt eine neue Klasse & diese erbt alle Funktionalitäten der alten,
		 * welche erweitert werden soll (z. B. bei Weiterentwicklung der Software)
		 * - Zusätzlich wird die neue Klasse dann um Attribute und/oder Methoden erweitert
		 */
		
		// Beispiel Dateien "VererbungHund", "VererbungKatze" & "VererbungTier"
		
		VererbungHund dog = new VererbungHund();
		dog.setName("Boomer");
		System.out.println(dog.getName());
		dog.sleep();
		System.out.println("That's the dog!");
		
		System.out.println();
		
		VererbungKatze cat1 = new VererbungKatze();
		cat1.setName("Benni");
		System.out.println(cat1.getName());
		cat1.sleep();
		cat1.purr();
		
		System.out.println();
		
		VererbungKatze cat2 = new VererbungKatze();
		cat2.setName("Jenny");
		System.out.println(cat2.getName());
		cat2.sleep();
		cat2.purr();
		
		

	}

}
