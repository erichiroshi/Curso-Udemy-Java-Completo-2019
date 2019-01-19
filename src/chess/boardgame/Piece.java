package chess.boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {

		return board;
	}

	public boolean[][] possibleMoves() {
		return null;

	}

	public boolean possibleMove(Position position) {

		return true;
	}

	public boolean isTherAnyPossibleMove() {
		return false;

	}

}
