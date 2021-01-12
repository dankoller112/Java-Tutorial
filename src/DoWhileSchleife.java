
public class DoWhileSchleife {

	public static void main(String[] args) {
		// Im Unterschied zur "while"-Schleife, wird nicht zu Beginn sodern erst am Ende geprüft
		// Somit wird Do-While Schleife mind. 1x ausgeführt
		
		int num = 0;
		
		// "Fußgesteuerte Schleife" (= "do"-Block wird mind. 1x ausgeführt, unabhängig der "while"-Bedingung
		// Beachte exakte Schreibweise
		do
		{
			System.out.println(num);
			num++;
		}
		while(num <= 10);
		// Code wird solange ausgeführt, bis Bedingung "false" wird (boolscher Wahrheitswert)
		

	}

}
