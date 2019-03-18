package animals;

public class Animal {
	String name;
	int age;
	String gender;
	public Animal(String name, int age, String gender) {
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
	}
	
	public void setName(String name) {
		if (name == null || name.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid input!");
		}
		
		this.name = name;
	}
	
	public void setAge(int age) {
		if (age < 1) {
	            throw new IllegalArgumentException("Invalid input!");
		}
		
		this.age = age;
	}
	
	public void setGender(String gender) {
		 if (gender == null || gender.trim().length() == 0) {
	            throw new IllegalArgumentException("Invalid input!");
		 }
		
		 this.gender = gender;
	}
	
	  private String getName() {
	        return this.name;
	    }

	    private int getAge() {
	        return this.age;
	    }

	    private String getGender() {
	        return this.gender;
	    }

	    public String produceSound() {
	        return "Not implemented!";
	    }

	    @Override
	    public String toString() {
	        return String.format(
	                "%s%n%s %d %s%n%s",
	                this.getClass().getSimpleName(),
	                this.getName(),
	                this.getAge(),
	                this.getGender(),
	                this.produceSound()
	        );
	}
	
}
