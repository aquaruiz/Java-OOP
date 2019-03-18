package onlineRadioDatabase;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		SongDatabase mySongBase = new SongDatabase();
		int counter = 0;
		
		for (int i = 0; i < n; i++) {
			String[] line = scanner.nextLine().split(";");
			String artist = line[0];
			String song = line[1];
			String length = line[2];
			
			try {
				Song currentSong = new Song(artist, song, length);
				mySongBase.addSong(currentSong);
				System.out.println("Song added.");
				counter++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		scanner.close();

		System.out.println("Songs added: " + counter);
		System.out.println(mySongBase.getTotalLengthOfSongs());
	}
}
