
public class WhileSchleife {

	public static void main(String[] args) {
		// Schleifen: Ermöglichen das wiederholte Ausführen von Code(-blöcken)
		// Sie eigenen sich ferner, um bspw. Listen oder Arrays zu füllen
		
		int num;
		num = 1;
		
		// "Kopfgesteuerte Schleife" (= zunächst erfolgt Auswertung)
		// Der Codeblock wird solange ausgeführt, bis die Bedingung erfüllt ist
		while(num <= 5) {
			System.out.println(num);
			// "+=" ist die Kurzform der Zuweisung "num = num + 1"
			num += 1;
			
			// Kurzform nur für die Erhöhung eines Wertes um 1
			// num++;
		}
		

	}

}
