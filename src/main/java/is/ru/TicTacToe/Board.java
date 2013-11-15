package is.ru.TicTacToe;
import java.util.Arrays;

public class Board {

	private int[] gameBoard;

	public Board() {
		gameBoard = new int[9];
		Arrays.fill(gameBoard, 0);
	}

	public void clearBoard() {
		for (int i = 0; i < gameBoard.length; i++) {
			this.set(i, 0);
		}
	}

	public int get(int arrI) {
		return gameBoard[arrI];
	}

	public void set(int arrI, int val) {
		gameBoard[arrI] = val;
	}
}