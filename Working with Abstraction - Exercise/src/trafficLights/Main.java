package trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] colors = scanner.nextLine().split(" ");
		List<TrafficLight> trafficLights = new ArrayList<>();
		
		for (String string : colors) {
			LightColor color = LightColor.valueOf(string);
			TrafficLight currentTrafficLight = new TrafficLight(color);
			trafficLights.add(currentTrafficLight);
		}
		
		int loops = Integer.parseInt(scanner.nextLine());
		
		scanner.close();
		
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < loops; i++) {
			for (TrafficLight trafficLight : trafficLights) {
				trafficLight.changeToNexColor();
				sBuilder.append(trafficLight + " ");
			}
			
			sBuilder.append(System.lineSeparator());
		}
		
		System.out.println(sBuilder.toString());
	}

}
