package TicTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame{
    private JButton[] buttons = new JButton[9];
    private boolean playerXsTurn = true;
    private String playerTurn = "X";
    public TicTacToe(){
            super("Tic Tac Toe");
            this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
            JPanel panel = new JPanel();
            GridLayout layout = new GridLayout(3, 3);
            layout.setHgap(3);
            layout.setVgap(3);
            this.add(panel);
            for(int i = 0;i < buttons.length;i++){
                buttons[i] = new JButton("");
                buttons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        gameButtonClicked(ae);
                    }
                });

                buttons[i].setPreferredSize(new Dimension(100, 100));

                panel.add(buttons[i]);
            }

    }
    public void markLocation(int row, int column){
        int spot = (row * 3) + column;
        buttons[spot].setText(playerTurn);
        String location = row + " " + column + " " + playerTurn;
        if (playerXsTurn) {
            playerTurn = "X";
        }
        else {
            playerTurn = "O";
        }
        
        if (buttons[spot].getText().equals("")) {
            buttons[spot].setText(playerTurn);
            playerXsTurn = !playerXsTurn;
        }
    }
	
    private void gameButtonClicked (ActionEvent ae) {
        JButton button = (JButton) ae.getSource();
        if (playerXsTurn) {
            playerTurn = "X";
        }
        else {
            playerTurn = "O";
        }
        
        if (button.getText().equals("")) {
            button.setText(playerTurn);
            playerXsTurn = !playerXsTurn;
            checkForWin(playerTurn);
        }
    }
	
    private String checkForWin() {
        String[] plays = new String[9];
        for (int i = 0; i < 9; i++) {
            plays[i] = buttons[i].getText();
        }
        
        String winningMoveX = "XXX";
		String winningMoveO = "OOO";
        
        String topRow = plays[0] + plays[1] + plays[2];
        String middleRow = plays[3] + plays[4] + plays[5];
        String bottomRow = plays[6] + plays[7] + plays[8];
        
        String leftColumn = plays[0] + plays[3] + plays[6];
        String middleColumn = plays[1] + plays[4] + plays[7];
        String rightColumn = plays[2] + plays[5] + plays[8];
        
        String topLeftToBottomRight = plays[0] + plays[4] + plays[8];
        String topRightToBottomLeft = plays[2] + plays[4] + plays[6];
        
        // check for winning move
        if (topRow.equals(winningMoveX)
                || middleRow.equals(winningMoveX)
                || bottomRow.equals(winningMoveX)
                || leftColumn.equals(winningMoveX)
                || middleColumn.equals(winningMoveX)
                || rightColumn.equals(winningMoveX)
                || topLeftToBottomRight.equals(winningMoveX)
                || topRightToBottomLeft.equals(winningMoveX))
        {
            JOptionPane.showMessageDialog(this, "X wins!");
            resetGame();
			return "X";
        }
		else if (topRow.equals(winningMoveO)
                || middleRow.equals(winningMoveO)
                || bottomRow.equals(winningMoveO)
                || leftColumn.equals(winningMoveO)
                || middleColumn.equals(winningMoveO)
                || rightColumn.equals(winningMoveO)
                || topLeftToBottomRight.equals(winningMoveO)
                || topRightToBottomLeft.equals(winningMoveO))
        {
            JOptionPane.showMessageDialog(this, "O wins!");
            resetGame();
			return "O";
        }
        else {
            // check for draw
            boolean draw = true;
            for (String play : plays) {
                if (play.equals("")) {
                    draw = false;
                }
            }

            if (draw) {
                JOptionPane.showMessageDialog(this, "Draw!");
                resetGame();
				return "TIE";
            }
        }
    }
	
	private void resetGame() {
        // start new game
        for (JButton button : buttons) {
            button.setText("");
            playerXsTurn = true;
        }
    }
	
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

