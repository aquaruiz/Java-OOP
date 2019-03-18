package person;

public class Child extends Person{

	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		}
		super.setName(name);
	}
	
	@Override
	protected void setAge(int age) {
		if (age > 15) {
			throw new IllegalArgumentException("Child's age must be lesser than 15!");
		}
		super.setAge(age);
	}
}