public class Elephant extends Action{
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
    

}
