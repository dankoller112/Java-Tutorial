// Siehe "Klassen.java"!
public class Computer {
	
	// Attribute/Eigenschaften
	private String color; // Farbe
	private String brand; // Marke
	private int memory; // Speicherplatz
	
	// Definierter Konstruktor (eigene Vorbelegung)
	public Computer(String color, String brand, int memory) {
		// Referenzierung durch "this."
		this.color = color;
		this.brand = brand;
		this.memory = memory;
		
		// this.running();
	}
	// Überladen eines Konstruktors
	public Computer() {
		System.out.println("Computer wurde erstellt.");
	}
	
	
	// Methoden (hier nicht statisch (= kein "static"))
	public void running(String works) {
		System.out.println("Der Computer funktioniert " + works + "!");
	}
	
	// Methode überladen (da neuer Parameter in weiterer Abfolge übergeben)
	public void running() {
		System.out.println("Der Computer funktioniert!");
	}
	
	// Getter & Setter können in Eclipse gesetzt werden über
	// "Source" > "Generate Getters and Setters..."

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getMemory() {
		return memory;
	}


	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
	
}
