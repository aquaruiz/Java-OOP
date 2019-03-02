package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimestions[0];
        int cols = dimestions[1];

        Galaxy galaxy = new Galaxy(rows, cols);

        String command = scanner.nextLine();
        long sum = 0;
        
        while (!command.equals("Let the Force be with you")) {
            int[] ivoCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            galaxy.doEvil(evilRow, evilCol);

            int ivoRow = ivoCoordinates[0];
            int ivoCol = ivoCoordinates[1];

            sum = galaxy.doGood(ivoRow, ivoCol, sum);
            command = scanner.nextLine();
        }

        scanner.close();
        System.out.println(sum);
    }
}