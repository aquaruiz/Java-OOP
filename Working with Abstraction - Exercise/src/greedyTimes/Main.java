package greedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        scanner.close();

        Bag myBag = new Bag(capacity);

        for (int i = 0; i < safe.length; i += 2) {
            String item = safe[i];
            long count = Long.parseLong(safe[i + 1]);
            
            
            if (item.length() == 3) {
                Cash newCash = new Cash(item, count);
                myBag.addCash(newCash);
            } else if (item.toLowerCase().endsWith("gem") && item.length() > 3) {
            	Gem newGem = new Gem(item, count);
            	myBag.addGem(newGem);
            } else if (item.toLowerCase().equals("gold")) {
            	myBag.addGold(count);
            }

        }

        System.out.println(myBag);
    }
}