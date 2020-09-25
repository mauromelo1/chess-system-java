package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException(BoardException.MSG_LEAST_1_ROW_1_COLUMN);
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	} // fim do construtor

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (positionNotExists(row, column)) {
			throw new BoardException(BoardException.MSG_POSITION_NOT_BOARD);
		}
		return pieces[row][column];
	} // fim piece

	public Piece piece(Position position) {
		if (positionNotExists(position)) {
			throw new BoardException(BoardException.MSG_POSITION_NOT_BOARD);
		}
		return pieces[position.getRow()][position.getColumn()];
	} // fim piece

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException(BoardException.MSG_THERE_IS_PIECE + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	} // fim placePiece

	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	} // fim positionExists

	public boolean positionNotExists(int row, int column) {
		return !positionExists(row, column);
	} // fim positionNotExists

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	} // fim positionExists

	public boolean positionNotExists(Position position) {
		return !positionExists(position);
	} // fim positionNotExists

	public boolean thereIsAPiece(Position position) {
		if (positionNotExists(position)) {
			throw new BoardException(BoardException.MSG_POSITION_NOT_BOARD);
		}
		return piece(position) != null;
	} // fim thereIsAPiece

}
