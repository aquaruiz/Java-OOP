package sortbyNameandAge;

public class Person {

	private String firstName;
	private String lastName;
	private Integer age;
	
	public Person(String firstName, String lastName, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return this.firstName;
	}

	private String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return this.age;
	}

	@Override
	public String toString() {
		return String.format("%s %s is %d years old.", 
					this.getFirstName(),
					this.getLastName(),
					this.getAge());
	}
}
