package boardgame;

public class BoardException extends RuntimeException {

	public static String MSG_LEAST_1_ROW_1_COLUMN = "Error creating board: there must be at least 1 row and 1 column";
	public static String MSG_POSITION_NOT_BOARD = "Position not on the board";
	public static String MSG_THERE_IS_PIECE = "There is already a piece on position ";

	private static final long serialVersionUID = 1L;

	public BoardException(String msg) {
		super(msg);
	}

}
