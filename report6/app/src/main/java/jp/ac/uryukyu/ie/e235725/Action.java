public class Action extends Board3x4{
    public Action() {
        super();
    }

    void goAhead() {
        char[][] board = getBoard();
    
        // 2番目の配列の各要素に1を加える
        board[0][1]++;
        board[1][1]++;
        board[2][1]++;
        board[3][1]++;
    
        // ここで何か処理を行う
    
        // 例: サンプルとして board の内容を表示する
        displayBoard();
    }
    

}

