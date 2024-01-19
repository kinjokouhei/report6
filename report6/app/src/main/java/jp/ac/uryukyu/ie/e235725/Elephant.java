public class Elephant extends Action{
    void goAhead() {
        char[][] board = getBoard();
    
        // 1番目の配列の各要素に1を加える
        board[0][0]++;
        board[0][1]++;
        board[0][2]++;
        // ここで何か処理を行う
    
        // 例: サンプルとして board の内容を表示する
        displayBoard();
    }

    void goDown() {
        char[][] board = getBoard();

        // 1番目の配列の各要素に1を減らす
        board[0][0]--;
        board[0][1]--;
        board[0][2]--;

        // ここで何か処理を行う

        // 例: サンプルとして board の内容を表示する
        displayBoard();
    }

    void goLeft() {
        char[][] board = getBoard();

        // 2番目の配列の各要素に1を減らす
        board[0][0]--;
        board[1][0]--;
        board[2][0]--;
        board[3][0]--;

        // ここで何か処理を行う

        // 例: サンプルとして board の内容を表示する
        displayBoard();
    }

    void goRight() {
        char[][] board = getBoard();

        // 2番目の配列の各要素に1を増やす
        board[0][0]++;
        board[1][0]++;
        board[2][0]++;
        board[3][0]++;

        // ここで何か処理を行う

        // 例: サンプルとして board の内容を表示する
        displayBoard();
    }
    

}
