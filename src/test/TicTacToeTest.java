package TicTacToe;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
	public void testStartNewGame(){
		TicTacToe game = new TicTacToe();
	}

	@Test
	public void testMarkLocation(int row, int col){
		game.mark(row, col);
	}

	@Test
	public String testCheckLocation(int row, int col){
		Assert.Equals( game.get(row, col);
	}    
}
