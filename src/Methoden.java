
public class Methoden {

	public static void main(String[] args) {
		/* Methoden sind ein Programmierkonzept
		 * 
		 * Eine Methode ist ein Teil vorprogrammierter Code,
		 * den man immer wieder erneut ausführen kann,
		 * ohne diesen neu zu schreiben
		 * 
		 * Methoden haben entweder einen Rückgabewert oder nicht
		 */
		
		// Methoden werden erst in der "main" Methode aufgerufen:
		
		System.out.println("Vor dem Methodenaufruf ...");
		
		doSomething(20, 10); // Aufruf
		
		System.out.println("... nach dem Methodenaufruf.");
		
	}
	/* Hier ein Beispiel für eine Methode "doSomething" ohen Rückgabewert:
	 * Außerhalb der "main" Methode!
	 * 
	 * Methodenkopf: "public static void"
	 * public static: Steht für die Objektorientierung
	 * void: Bezeichnet den Rückgabewert (hier kein Wert = "void")
	 */
	public static void doSomething(int num1, int num2 /* = Parameter*/) {
		// Durch die Parameter wird die Methode mit den o. g. Werten aufgerufen
		 int x = num1;
		 int y = num2;
		 int result = x * y;
		 System.out.println(result);
	}

}
