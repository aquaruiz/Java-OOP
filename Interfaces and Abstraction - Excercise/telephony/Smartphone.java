//package telephony;

import java.util.LinkedList;
import java.util.List;

public class Smartphone implements Callable, Browsable {

	private List<String> numbers;
	private List<String> urls;
	
	public Smartphone(List<String> numbers, List<String> urls) {
		this.numbers = new LinkedList<>(numbers);
		this.urls = new LinkedList<>(urls);
	}
	
	@Override
	public String browse() {
		StringBuilder sBuilder = new StringBuilder();
		
		for (String url : this.urls) {
			if (this.containsDigit(url)) {
				sBuilder.append("Invalid URL!")
				.append(System.lineSeparator());
			} else {
				sBuilder.append(String.format("Browsing: %s!", url))
				.append(System.lineSeparator());
			}
		}
		
		return sBuilder.toString();
	}

	private boolean containsDigit(String input) {
		for (char ch : input.toCharArray()) {
			if (Character.isDigit(ch)) {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean containsLetter(String input) {
		for (char ch : input.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String call() {
		StringBuilder sBuilder = new StringBuilder();
		for (String number : this.numbers) {
			if (this.containsLetter(number)) {
				sBuilder.append("Invalid number!")
				.append(System.lineSeparator());
			} else {
				sBuilder.append(String.format("Calling... %s", number))
				.append(System.lineSeparator());
			}
		}	
		
		return sBuilder.toString();
	}
}