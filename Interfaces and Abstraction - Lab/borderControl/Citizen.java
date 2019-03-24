package borderControl;

public class Citizen implements Identifiable {
	private String name;
	private int age;
	private String id;
	
	public Citizen(String name, int age, String id) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
//	public boolean isValid(String substring) {
//		return !this.getId().endsWith(substring);
//	}
}
