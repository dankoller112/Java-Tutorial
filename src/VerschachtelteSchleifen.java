
public class VerschachtelteSchleifen {

	public static void main(String[] args) {
		// Kombination bisher erlernter Schleifenarten
		
		for(int i = 1; i < 4; i++) // Schleifenvariablen nur innerhalb der Schleife gültig
		{
			for(int j = 1; j < 4; j++)
			{
				System.out.print("x ");
			}
			System.out.println(); // Keine Übergabe, Befehl sorgt lediglich für Zeilenumbruch
		}

	}

}
