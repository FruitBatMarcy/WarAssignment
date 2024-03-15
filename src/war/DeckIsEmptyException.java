package war;

public class DeckIsEmptyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DeckIsEmptyException(String error) {
		super(error);
	}
}
