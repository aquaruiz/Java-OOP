package onlineRadioDatabase;

@SuppressWarnings("serial")
public class InvalidSongMinutesException extends InvalidSongLengthException {
	public InvalidSongMinutesException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "Song minutes should be between 0 and 14.";
	}
}
