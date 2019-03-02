package trafficLights;

public class TrafficLight {
	private LightColor color;
	
	public TrafficLight(LightColor color) {
		this.color = color;
	}
	
	public void changeToNexColor() {
		switch (this.color) {
		case RED:
			setNewColor("GREEN");
			break;
		case GREEN:
			setNewColor("YELLOW");
			break;
		case YELLOW:
			setNewColor("RED");
			break;
		default:
			break;
		}
	}
	
	private void setNewColor(String color) {
		LightColor newColor = LightColor.valueOf(color);
		this.color = newColor;
	}
	
	@Override
	public String toString() {
		return this.color.name();
	}
}