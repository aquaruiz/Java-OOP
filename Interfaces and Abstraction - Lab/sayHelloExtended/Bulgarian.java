package sayHelloExtended;

public class Bulgarian extends BasePerson implements Person{

	public Bulgarian(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() {
		return "Здравей";
	}

}
