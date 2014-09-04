
package tictactoe;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author Steven
 */
public class TicTacToe extends JFrame{
    private JLabel label = new JLabel("X's Turn");
    private JButton[] buttons = new JButton[9];
    public TicTacToe(){
            super("Tic-Tac-Toe");
            this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
            this.add(label);
            JPanel panel = new JPanel();
            GridLayout layout = new GridLayout(3, 3);
            layout.setHgap(3);
            layout.setVgap(3);
            this.add(panel);
            for(int i = 0;i < buttons.length;i++){
                    buttons[i] = new JButton("");
            }

    }
    public void markLocation(int row, int column){
        int spot = (row * 3) + column;
        buttons[spot].setText("X");
        String location = row + " " + column + " " + playerTurn;
    }


    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.setVisible(true);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

