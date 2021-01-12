
public class ModuloOperator {

	public static void main(String[] args) {
		// "%" = Operator
		// Im Vergleich zu anderen Operatoren wird beim Modulo der RESTWERT einer Division ausgegeben, nicht das Ergebnis an sich!
		
		// Beispiel:
		int num1 = 42;
		int num2 = 4;
		int modulo = num1 % num2;
		System.out.println(modulo); // Ergebnis "2", da 42 / 4 = 10, REST 2
		
		// Vergleich "normale" Division:
		int div = num1 / num2;
		System.out.println(div); // Ergebnis "10", da "4" 10 x in "42" passt
		
		// Kein Rest:
		int num3 = 21;
		int modulo2 = num1 % num3;
		System.out.println(modulo2); // Ergebnis "0", da 42 / 21 = 2, REST 0
		
		// Wieder normale Division ohne Rest
		int div2 = num1 / num3;
		System.out.println(div2); // Ergebnis "2", da "21" 2 x in "42" passt
	}

}
