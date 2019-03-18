package onlineRadioDatabase;

@SuppressWarnings("serial")
public class InvalidSongLengthException extends InvalidSongException {
	public InvalidSongLengthException(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return "Invalid song length.";
	}
}
