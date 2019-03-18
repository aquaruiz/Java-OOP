package mordorsCrueltyPlan;

public enum Food {
    cram(2),
    lembas(3),
    apple(1),
    melon(1),
    honeycake(5),
    mushrooms(-10),
    Else(-1);
	
	private int value;
	
	private Food(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
