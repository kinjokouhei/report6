public class Hiyoko extends Action{
    void goAhead() {
        char[][] board = getBoard();
    
        board[0][0]++;
        board[0][1]++;
        board[0][2]++;
     
        displayBoard();
    }
}
