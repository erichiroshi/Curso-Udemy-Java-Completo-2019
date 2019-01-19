package chess.chess;

import chess.boardgame.Board;
import chess.boardgame.Piece;
import chess.boardgame.Position;

public class ChessPiece extends Piece {

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public ChessPosition getChessPostion() {

		return null;
	}

	protected boolean isTherOpponentPiece(Position position) {

		return true;
	}

	protected void increaseMoveCount() {

	}

	protected void decreaseMoveCount() {

	}

}
