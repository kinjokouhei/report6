public class Lion extends Action{
    void goAhead() {
        char[][] board = getBoard();
    
       
        board[0][0]++;
        board[0][1]++;
        board[0][2]++;
    
        displayBoard();
    }
    void goDown() {
        char[][] board = getBoard();


        board[0][0]--;
        board[0][1]--;
        board[0][2]--;

     
        displayBoard();
    }

    void goLeft() {
        char[][] board = getBoard();

     
        board[0][0]--;
        board[1][0]--;
        board[2][0]--;
        board[3][0]--;

        displayBoard();
    }

    void goRight() {
        char[][] board = getBoard();

        board[0][0]++;
        board[1][0]++;
        board[2][0]++;
        board[3][0]++;

        displayBoard();
    }

    void goRightAhead() {
        char[][] board = getBoard();

        // 右斜め前に動く処理
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

        // 左斜め後ろに動く処理
        for (int i = 0; i < board.length; i++) {
            if (board[i][1] > 0) {
                board[i][1]--;
            }
        }

        displayBoard();
    }
}
