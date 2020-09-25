package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	} // fim do construtor

	@Override
	public String toString() {
		return "K";
	} // fim toString

}
