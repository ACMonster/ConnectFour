/*
 *	Maintain the state of the game:
 *		add pieces to the board
 *		check whether the game has ended and decides the winner
 */

public class GameState {

	private int width, height;
	private int[][] board;

	GameState(int width, int height) {
		this.width = width;
		this.height = height;
		board = new int[width][height];
	}

	/* 
	 *	add a piece for player id (+1 or -1) at column col
	 *	return true for a success move
	 */
	public boolean addPiece(int id, int col) {
		if(board[0][col] != 0)
			return false;
		int pos = 0;
		while(pos < height && board[pos][col] == 0)
			pos++;
		board[pos - 1][col] = id;
		return true;
	}

	/*
	 *	return the id (+1 or -1) of the winner (0 in case of a draw)
	 *	or 2 if the game has not ended
	 */
	public int winner() {
		for(int i = 0; i < height; i++)
			for(int j = 0; j < width; j++) {
				//check whether some player wins
			}
		boolean full = true;
		for(int i = 0; i < width; i++)
			if(board[0][i] == 0)
				full = false;
		return full ? 0 : 2;
	}
}