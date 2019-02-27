package hotelReservation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(" ");
		
		double pricePerDay = Double.parseDouble(input[0]);
		int numberOfDays = Integer.parseInt(input[1]);
		String season = input[2];
		String discountType = input[3];

		Season seas = Season.valueOf(season);
		Discount discount = Discount.valueOf(discountType);
		
		PriceCalculator calc = new PriceCalculator(pricePerDay, numberOfDays, seas, discount);
		
		DecimalFormat priceFormat = new DecimalFormat("0.00");
		
		System.out.println(priceFormat.format(calc.calcPrice()));
		
		scanner.close();
	}

}
