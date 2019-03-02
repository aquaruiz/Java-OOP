package trafficLights;

public enum LightColor {
	RED,
	GREEN,
	YELLOW;
	
	int value;
	
	private LightColor() {
		// TODO Auto-generated constructor stub
	}
	
	public int getValue() {
		return value;
	}
}
