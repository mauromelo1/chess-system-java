package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
	
	public static String MSG_ERROR_CHESSPOSITION = "Error instantiating ChessPosition. Valid values are from a1 to h8";
	public static String MSG_ERROR_READ_CHESSPOSITION = "Error reading ChessPosition. Valid values are from a1 to h8";
	public static String MSG_NO_PIECE_SOURCE = "there is no piece on source position";
	
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}

}
