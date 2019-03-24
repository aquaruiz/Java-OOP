package borderControl;

public class Robot implements Identifiable {
	private String model;
	private String id;
	
	public Robot(String id, String model) {
		this.id = id;
		this.model = model;
	}

	public String getId() {
		return id;
	}
	
	public String getModel() {
		return model;
	}
	
//	public boolean isValid(String substring) {
//		return !this.getId().endsWith(substring);
//	}
}
