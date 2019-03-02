package greedyTimes;

public class Gold {
	long totalAmount;
	boolean isAdded;
	
	public Gold() {
		totalAmount = 0;
		isAdded = false;
	}
	
	public void addmore(long amount) {
		totalAmount += amount;
		isAdded = true;
	}
	
	public long getTotalAmount() {
		return totalAmount;
	}
	
	public boolean isAdded() {
		return isAdded;
	}
}
