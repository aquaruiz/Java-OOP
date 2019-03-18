package person;


public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) throws IllegalArgumentException {
		this.setName(name);
		this.setAge(age);
	}
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) throws IllegalArgumentException {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	protected void setAge(int age) throws IllegalArgumentException {
		if (age < 1) {
			throw new IllegalArgumentException("Age must be positive!");
		}
		
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Name: %s, Age: %d", 
				this.getName(),
				this.getAge());
	}
}