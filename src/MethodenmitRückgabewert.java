
public class MethodenmitRückgabewert {

	public static void main(String[] args) {
		/*
		 * Rückgabewert ist "Ergebnis" der Methode bzw. der Wert der an Aufrufer
		 * zurückgegeben wird
		 */
		
		System.out.println("Vor dem Methodenaufruf ...");
		/* Das Ergebnis (= "result") wird zwar zurückgegeben, aber noch nicht verarbeitet
		 * doSomething(10, 20);
		 * Erst du entsprechende Methode (bspw. "println") wird der Rückgabewert verarbeitet
		 */
		System.out.println(doSomething(10, 20));
		/*
		 * Alternativ kann man den Rückgabewert der (hier "doSomething") Methode in "main" 
		 * speichern
		 */
		int resultFromMethodDoSomething = doSomething(10,50);
		System.out.println(resultFromMethodDoSomething);
		
		System.out.println("... nach dem Methodenaufruf.");

	}
	/*
	 * Statt "void" muss der Datentyp des Rückgabewerts (= hier "int") angegeben werden
	 */
	public static int doSomething(int num1, int num2) {

		/*
		int result = num1 * num2;
		// Rückgabe erfolgt mittels "return"
		return result;
		*/
		
		// Alternativ als Kurzform
		return num1 * num2;
	}

}
