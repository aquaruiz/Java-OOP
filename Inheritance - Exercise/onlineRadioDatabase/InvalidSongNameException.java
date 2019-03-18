package onlineRadioDatabase;

@SuppressWarnings("serial")
public class InvalidSongNameException extends InvalidSongException {
	public InvalidSongNameException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "Song name should be between 3 and 30 symbols.";
	}
}
