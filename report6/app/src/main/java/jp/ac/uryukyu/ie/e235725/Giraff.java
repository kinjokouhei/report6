public class Giraff extends Action{
    void goRightAhead() {
        char[][] board = getBoard();

        for (int i = 0; i < board.length; i++) {
            if (board[i][1] < board.length - 1) {
                board[i][1]++;
            }
        }

      
        displayBoard();
    }

    void goRightDown() {
        char[][] board = getBoard();

        
        for (int i = 0; i < board.length; i++) {
            if (board[i][1] > 0) {
                board[i][1]--;
            }
        }

  
        displayBoard();
    }

    void goLeftAhead() {
        char[][] board = getBoard();

      
        for (int i = 0; i < board.length; i++) {
            if (board[i][1] < board.length - 1) {
                board[i][1]++;
            }
        }

   
        displayBoard();
    }

    void goLeftDown() {
        char[][] board = getBoard();

       
        for (int i = 0; i < board.length; i++) {
            if (board[i][1] > 0) {
                board[i][1]--;
            }
        }

        displayBoard();
    }
}
