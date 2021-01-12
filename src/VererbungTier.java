
public class VererbungTier {
		
	// Attribute
	private String name;
	private int age;
			
	// Methoden
	public void sleep() {
		System.out.println("schläft...");
	}
	
	// Da Attribute private, werden getters & setters benötigt
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
			
}
