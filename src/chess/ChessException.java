package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

	private static final long serialVersionUID = 1L;

	public static String MSG_ERROR_CHESSPOSITION = "Error instantiating ChessPosition. Valid values are from a1 to h8";
	public static String MSG_ERROR_READ_CHESSPOSITION = "Error reading ChessPosition. Valid values are from a1 to h8";
	public static String MSG_NO_PIECE_SOURCE = "There is no piece on source position";
	public static String MSG_NO_POSSIBLE_MOVES = "There is no possible moves for the chosen piece";
	public static String MSG_NO_POSSIBLE_MOVE_TARGET = "The chose piece can't move to target position";
	public static String MSG_NO_CURRENT_PLAYER = "The chosen piece is not yours";

	public ChessException(String msg) {
		super(msg);
	}

}
