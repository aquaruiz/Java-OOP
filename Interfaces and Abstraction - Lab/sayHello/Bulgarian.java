package sayHello;

public class Bulgarian extends PersonImpl implements Person{

	public Bulgarian(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() {
		return "Здравей";
	}

}
