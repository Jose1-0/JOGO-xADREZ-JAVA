package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//O construtor foi gerado só com o tabuleiro pois as peças teram o valor nuilo por hora 
	public Piece(Board board) {
		this.board = board;
		position = null; // n é obrigatorio.
	}

	protected Board getBoard() {
		return board;
	}
		
}
