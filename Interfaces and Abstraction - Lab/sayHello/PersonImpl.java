package sayHello;

public abstract class PersonImpl {
	protected String name;
	
	public PersonImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
