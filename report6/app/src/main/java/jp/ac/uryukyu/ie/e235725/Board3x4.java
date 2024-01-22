package jp.ac.uryukyu.ie.e235725;
class Board3x4 {
    private char[][] board;

    char[][] getBoard() {
        return board;
    }
    /**
     * ゲームボードを初期化する。
     * 特定の位置に特定の駒が配置された3x4将棋盤。
     */
    public void initializeBoard() {
        // 初期盤面
        board = new char[][]{
                {'k', 'l', 'z'},
                {' ', 'h', ' '},
                {' ', 'H', ' '},
                {'Z', 'L', 'K'}
                //縦ABCD、 横123
        };
    }
    /**
     * 盤の状態を表示する。
     */
    public void displayBoard() {
        // 盤面の表示
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    //public boolean isGameOver() {
        //return 
    //}
}
