package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	} // fim do construtor

	protected Board getBoard() {
		return board;
	}

}
