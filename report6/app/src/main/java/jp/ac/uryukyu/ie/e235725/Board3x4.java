package jp.ac.uryukyu.ie.e235725;
import java.util.ArrayList;
import java.util.List;

class Board3x4 {
    ArrayList<ArrayList<Character>> board;

    Board3x4(ArrayList<ArrayList<Character>> board) {
        this.board = board;
    }

    /**
     * ゲームボードを初期化する。
     * 特定の位置に特定の駒が配置された3x4将棋盤。
     */
    public void initializeBoard() {
            ArrayList<Character> row1 = new ArrayList<>(List.of('k', 'l', 'z'));
            ArrayList<Character> row2 = new ArrayList<>(List.of(' ', 'h', ' '));
            ArrayList<Character> row3 = new ArrayList<>(List.of(' ', 'H', ' '));
            ArrayList<Character> row4 = new ArrayList<>(List.of('Z', 'L', 'K'));

            // ボードに各行を追加
            board.add(row1);
            board.add(row2);
            board.add(row3);
            board.add(row4);
    }

    /**
     * 盤の状態を表示する。
     */
    public void displayBoard() {
        
        for (int i = 0; i < board.size(); i++) {
            ArrayList<Character> row = board.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }
    

    
}
