package chess.application;

import java.util.Scanner;

import chess.chess.ChessMatch;
import chess.chess.ChessPiece;
import chess.chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(input);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(input);

			ChessPiece capturePiece = chessMatch.performChessMove(source, target);

		}
	}

}
