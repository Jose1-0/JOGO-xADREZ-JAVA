package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	// deixei só o get pois quero que a cor de uma peça só seja acessada e não modificada
	
}
