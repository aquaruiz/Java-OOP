package onlineRadioDatabase;

import java.util.LinkedList;
import java.util.List;

public class SongDatabase {
	List<Song> songs;
	
	public SongDatabase() {
		this.songs = new LinkedList<>();
	}
	
	public void addSong(Song song) {
		this.songs.add(song);
	}
	
	public String getTotalLengthOfSongs() {
		int totalMins = 0;
		int totalSecs = 0;
		for (Song song : this.songs) {
			String[] currentMinSecs = song.getLength().split(":");
			totalMins += Integer.parseInt(currentMinSecs[0]);
			totalSecs += Integer.parseInt(currentMinSecs[1]);
		}
		
		totalMins += (int) (totalSecs / 60);
		totalSecs = totalSecs % 60;
		int hours = 0;
		hours += (int) (totalMins / 60);
		totalMins = totalMins % 60;
		
		return String.format("Playlist length: %dh %dm %ds", 
					hours,
					totalMins,
					totalSecs);
	}
}