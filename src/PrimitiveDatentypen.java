
public class PrimitiveDatentypen {

	public static void main(String[] args) {
		// #03 "Primitive Datentypen" (// Größe, Funktion)
		
		boolean bool = true; // undefiniert, true/false
		
		char cha = 'A'; // 16 Bit, Ausgabe von Text(-zeichen)
		
		byte bit = 127; // 8 Bit, Zeichen von -128 bis 127
		
		short kurz = 32767; // 16 Bit, Zeichen von -32768 bis 32767
		
		int zahl = 24; // 32 Bit, Ausgabe Zahlen mit hoher Genauigkeit
		
		int text = 'B'; // 32 Bit, Kann auch für Text verwendet werden
		
		long lang = 25000000; // 64 Bit, Ausgabe mit sehr hoher Genauigkeit
		
		float kommazahl = 24.5f; // 32 Bit, Ausgabe von Nachkommastellen -> "f" nach letzter Stelle
		
		double doppel = 1234.567890123456; // 64 Bit, Ausgabe mit extremer Genauigkeit -> Kein "f" am Ende, dafür mehr Speicher von Nöten -> Ggf. Rundung am Ende beachten!
		
		System.out.println(bool);
		System.out.println(cha);
		System.out.println(bit);
		System.out.println(kurz);
		System.out.println(zahl);
		System.out.println(text);
		System.out.println(lang);
		System.out.println(kommazahl);
		System.out.println(doppel);
		

	}

}
