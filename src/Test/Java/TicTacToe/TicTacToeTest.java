package TicTacToe;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public String testWinMainDiagonallyAsX(){
        TicTacToe game = new TicTacToe();
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "X");
		game.markLocation(0, 1);
		game.checkLocation(0, 1, "O");
		game.markLocation(0, 0);
		game.checkLocation(0, 0,"X");
		game.markLocation(0, 2);
		game.checkLocation(0, 2, "O");
		game.markLocation(2, 2);
		game.checkLocation(2, 2, "X");
		game.checkForWin();
    }
	
    @Test
    public String testWinReverseDiagonallyAsO(){
        TicTacToe game = new TicTacToe();
		game.markLocation(0, 1);
		game.checkLocation(0, 1, "X");
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "O");
		game.markLocation(0, 0);
		game.checkLocation(0, 0,"X");
		game.markLocation(0, 2);
		game.checkLocation(0, 2, "O");
		game.markLocation(1, 0);
		game.checkLocation(1, 0, "X");
		game.markLocation(2, 0);
		game.checkLocation(2, 0, "O");
		game.checkForWin();
    }
	
	@Test
    public String testWinFirstVerticallyAsX(){
        TicTacToe game = new TicTacToe();
		game.markLocation(1, 0);
		game.checkLocation(1, 0, "X");
		game.markLocation(2, 1);
		game.checkLocation(2, 1, "O");
		game.markLocation(0, 0);
		game.checkLocation(0, 0,"X");
		game.markLocation(2, 2);
		game.checkLocation(2, 2, "O");
		game.markLocation(2, 0);
		game.checkLocation(2, 0, "X");
		game.checkForWin();
    }
	
	@Test
    public String testWinSecondVerticallyAsX(){
        TicTacToe game = new TicTacToe();
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "X");
		game.markLocation(2, 0);
		game.checkLocation(2, 0, "O");
		game.markLocation(0, 1);
		game.checkLocation(0, 1,"X");
		game.markLocation(2, 2);
		game.checkLocation(2, 2, "O");
		game.markLocation(2, 1);
		game.checkLocation(2, 1, "X");
		game.checkForWin();
    }
	
	@Test
    public String testWinThirdVerticallyAsO(){
        TicTacToe game = new TicTacToe();
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "X");
		game.markLocation(2, 2);
		game.checkLocation(2, 2, "O");
		game.markLocation(0, 1);
		game.checkLocation(0, 1,"X");
		game.markLocation(1, 2);
		game.checkLocation(1, 2, "O");
		game.markLocation(0, 0);
		game.checkLocation(0, 0, "X");
		game.markLocation(0, 2);
		game.checkLocation(0, 2, "O");
		game.checkForWin();
    }
	
	@Test
    public String testWinFirstHorizontallyAsX(){
        TicTacToe game = new TicTacToe();
		game.markLocation(0, 0);
		game.checkLocation(0, 0, "X");
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "O");
		game.markLocation(0, 1);
		game.checkLocation(0, 1,"X");
		game.markLocation(1, 0);
		game.checkLocation(1, 0, "O");
		game.markLocation(0, 2);
		game.checkLocation(0, 2, "X");
		game.checkForWin();
    }
	
	@Test
    public String testWinSecondHorizontallyAsO(){
        TicTacToe game = new TicTacToe();
		game.markLocation(0, 0);
		game.checkLocation(0, 0, "X");
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "O");
		game.markLocation(0, 1);
		game.checkLocation(0, 1,"X");
		game.markLocation(1, 0);
		game.checkLocation(1, 0, "O");
		game.markLocation(2, 2);
		game.checkLocation(2, 2, "X");
		game.markLocation(1, 2);
		game.checkLocation(1, 2, "O");
		game.checkForWin();
    }
	
	@Test
    public String testWinThirdHorizontallyAsO(){
        TicTacToe game = new TicTacToe();
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "X");
		game.markLocation(2, 0);
		game.checkLocation(2, 0, "O");
		game.markLocation(0, 0);
		game.checkLocation(0, 0,"X");
		game.markLocation(2, 2);
		game.checkLocation(2, 2, "O");
		game.markLocation(0, 2);
		game.checkLocation(0, 2, "X");
		game.markLocation(2, 1);
		game.checkLocation(2, 1, "O");
		game.checkForWin();
    }
    @Test
    public String testForceATie(){
        TicTacToe game = new TicTacToe();
		game.markLocation(0, 1);
		game.checkLocation(0, 1, "X");
		game.markLocation(1, 1);
		game.checkLocation(1, 1, "O");
		game.markLocation(0, 0);
		game.checkLocation(0, 0,"X");
		game.markLocation(0, 2);
		game.checkLocation(0, 2, "O");
		game.markLocation(1, 0);
		game.checkLocation(1, 0, "X");
		game.markLocation(2, 0);
		game.checkLocation(2, 0, "O");
		game.checkForWin();
    }
}
