package sayHello;

public class Chinese extends PersonImpl implements Person {

	public Chinese(String name) {
		super(name);
	}

	@Override
	public String sayHello() {
		return "Djydjybydjy";
	}

}
