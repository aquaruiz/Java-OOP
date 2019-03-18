package onlineRadioDatabase;

@SuppressWarnings("serial")
public class InvalidArtistNameException extends InvalidSongException {
	public InvalidArtistNameException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "Artist name should be between 3 and 20 symbols.";
	}
}
