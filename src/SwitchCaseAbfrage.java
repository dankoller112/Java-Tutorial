
public class SwitchCaseAbfrage {

	public static void main(String[] args) {
		// Switch-Case Abfrage
		// Im Gegensatz zu "If-Abfragen" wird der Code(-block) nicht anhand einer zu erfüllenden Bedingung ausgeführt, sondern mittels Konstanten
		
		// Beispiel 1:
		
		int num = 2;
		
		switch(num) {
		// "case" ist der Fall, der Eintritt
		// Der Wert hinter dem "case" bezeichnet nicht die Reihenfolge o. Ä., sondern vielmehr den Wert an sich (kann auch was anderes sein)
		// Bei Abfrage werden die cases der Reihe nach überprüft, ob der Wert der Konstanten entspricht (in diesem Beispiel "2")
		// "break" beendet die Abfrage, sobald der Wert (die Konstante) erfüllt wird
		case 1: System.out.println("\"num\" hat den Wert 1"); break;
		case 2: System.out.println("\"num\" hat den Wert 2"); break;
		case 3: System.out.println("\"num\" hat den Wert 3"); break;
		default: System.out.println("\"num\" hat einen anderen Wert...");
		// Wenn kein Wert erfüllt wird, wird "default" ausgegeben
		}
		
		// Beispiel 2:
		
		int month = 12;
		
		switch(month) {
		case 1: System.out.println("Januar"); break;
		case 2: System.out.println("Februar"); break;
		case 3: System.out.println("März"); break;
		case 4: System.out.println("April"); break;
		case 5: System.out.println("Mai"); break;
		case 6: System.out.println("Juni"); break;
		case 7: System.out.println("Juli"); break;
		case 8: System.out.println("August"); break;
		case 9: System.out.println("September"); break;
		case 10: System.out.println("Oktober"); break;
		case 11: System.out.println("November"); break;
		case 12: System.out.println("Dezember"); break;
		default: System.out.println("Diesen Monat gibt es nicht lol.");
		
		}
		
		// Beispiel 3:
		
		String name = "Daniel";
		
		switch(name) {
		case "Daniel": System.out.println("Ja, das ist mein Name."); break;
		case "Linda": System.out.println("So heißt meine Freundin"); break;
		default: System.out.println("Boomer, that's the dog!");
		}
		
	}

}
