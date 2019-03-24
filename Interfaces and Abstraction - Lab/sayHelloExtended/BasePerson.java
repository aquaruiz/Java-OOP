package sayHelloExtended;

public abstract class BasePerson {
	private String name;
	
	protected BasePerson(String name) {
		this.setName(name);;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
}
