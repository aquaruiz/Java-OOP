package onlineRadioDatabase;

@SuppressWarnings("serial")
public class InvalidSongSecondsException extends InvalidSongLengthException {
	public InvalidSongSecondsException(String message) {
		super(message);
	}
	@Override
	public String getMessage() {
		return "Song seconds should be between 0 and 59.";
	}
}
