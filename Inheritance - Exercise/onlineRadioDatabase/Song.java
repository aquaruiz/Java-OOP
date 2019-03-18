package onlineRadioDatabase;

public class Song {
	String artistName;
	String songName;
	String length;
	
	public Song(String artistName, String songName, String length) throws InvalidSongException {
		this.setArtistName(artistName);
		this.setSongName(songName);
		this.setLength(length);
	}
	
	public void setArtistName(String artistName) throws InvalidArtistNameException {
		if (artistName.length() < 3
				|| artistName.length() > 20) {
			throw new InvalidArtistNameException("");
		}
		
		this.artistName = artistName;
	}
	
	public void setSongName(String songName) throws InvalidSongNameException {
		if (songName.length() < 3 
				||songName.length() > 30) {
			throw new InvalidSongNameException("");
		}
		
		this.songName = songName;
	}
	
	public String getLength() {
		return length;
	}
	
	public void setLength(String length) throws InvalidSongLengthException {
		if (length == null) {
			throw new InvalidSongLengthException("");
		}
		
		String[] lengths = length.split(":");
		int minutes = Integer.parseInt(lengths[0]);
		int seconds = Integer.parseInt(lengths[1]);
		
		if (minutes < 0
				|| minutes > 14) {
			throw new InvalidSongMinutesException("");
		}
		
		if (seconds < 0
				|| seconds > 59) {
			throw new InvalidSongSecondsException("");
		}
		
		this.length = length;
	}
}