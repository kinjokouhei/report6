

//大文字は上に攻める　L:ライオン、Z:ゾウ、K:キリン、H:ひよこ
//小文字は下に攻める　l:ライオン、z:ゾウ、k:キリン、h:ひよこ
//ルール　奪った駒は将棋のように持ち駒にするのではなく、チェスのようにする


class Board3x4 {
    private char[][] board;
    char[][] getBoard(){
        return board;
    }

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


    public void displayBoard() {
        // 盤面の表示
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }






    public boolean makeMove(String move) {
        // 駒の移動を処理するロジックを実装する
        return true; // 仮の実装
    }

    public boolean isGameOver() {
        // ゲーム終了条件の判定を実装する
        return false; // 仮の実装
    }
}
