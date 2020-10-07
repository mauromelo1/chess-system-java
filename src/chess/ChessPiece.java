package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	} // fim do construtor

	public Color getColor() {
		return color;
	} // fim getColor

	public int getMoveCount() {
		return moveCount;
	} // fim getMoveCount

	public void increaseMoveCount() {
		moveCount++;
	} // fim increaseMoveCount

	public void decreaseMoveCount() {
		moveCount--;
	} // fim decreaseMoveCount

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	} // fim getChessPosition

	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	} // fim isThereOpponentPiece
}
