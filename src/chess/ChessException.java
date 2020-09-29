package chess;

public class ChessException extends RuntimeException {
	
	public static String MSG_ERROR_CHESSPOSITION = "Error instantiating ChessPosition. Valid values are from a1 to h8";

	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}

}
