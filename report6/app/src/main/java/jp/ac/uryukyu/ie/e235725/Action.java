package jp.ac.uryukyu.ie.e235725;
import java.util.Scanner;

class Action extends Board3x4 {
    private static Scanner scanner = new Scanner(System.in);
    

    /**
     * 指定された位置の駒を移動させる。
     * 移動方向はプレイヤーに選択させて移動処理を行う。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void movePiece(int row, int column) {
        // 移動方向を選択
        System.out.println("どの方向に進めますか？ (1: 上, 2: 下, 3: 左, 4: 右, 5: 右上, 6:左上, 7: 右下, 8: 左下)");

        int direction = scanner.nextInt();

        // 移動処理
        switch (direction) {
            case 1: goUp(row, column); break;
            case 2: goDown(row, column); break;
            case 3: goLeft(row, column); break;
            case 4: goRight(row, column); break;
            case 5: goRightUp(row, column); break;
            case 6: goLeftUp(row, column); break;
            case 7: goRightDown(row, column); break;
            case 8: goLeftDown(row, column); break;
            default:
                System.out.println("無効な入力です。");
        }

        // 親クラスの displayBoard() を呼び出す
        super.displayBoard();
    }


    /**
     * 指定された位置が有効な位置かどうかを判定する。
     *
     * @param row    判定する駒の行。
     * @param column 判定する駒の列。
     * @return 有効な位置であればtrue、それ以外の場合はfalse。
     */
    public boolean isValidPosition(int row, char column) {
        // 有効な位置かどうかを確認するロジックを実装する
        return row >= 0 && row < getBoard().length && column >= 'A' && column < 'D';
    }
    

    /**
     * 指定された位置から上に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goUp(int row, int column) {
        // 上に移動する処理
        if (row > 0) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row - 1][column] = piece;
        }
    }

    /**
     * 指定された位置から下に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goDown(int row, int column) {
        // 下に移動する処理
        if (row < getBoard().length - 1) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row + 1][column] = piece;
        }
    }

    /**
     * 指定された位置から左に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goLeft(int row, int column) {
        // 左に移動する処理
        if (column > 0) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row][column - 1] = piece;
        }
    }

    /**
     * 指定された位置から右に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goRight(int row, int column) {
        // 右に移動する処理
        if (column < getBoard()[row].length - 1) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row][column + 1] = piece;
        }
    }

    /**
     * 指定された位置から左上に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goLeftUp(int row, int column) {
        // 左上に移動する処理
        if (row > 0 && column > 0) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row - 1][column - 1] = piece;
        }
    }
    
    /**
     * 指定された位置から右上に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goRightUp(int row, int column) {
        // 右上に移動する処理
        if (row > 0 && column < getBoard()[0].length - 1) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row - 1][column + 1] = piece;
        }
    }
    
    /**
     * 指定された位置から左下に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goLeftDown(int row, int column) {
        // 左下に移動する処理
        if (row < getBoard().length - 1 && column > 0) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row + 1][column - 1] = piece;
        }
    }
    
    /**
     * 指定された位置から右下に移動する。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void goRightDown(int row, int column) {
        // 右下に移動する処理
        if (row < getBoard().length - 1 && column < getBoard()[0].length - 1) {
            char piece = getBoard()[row][column];
            getBoard()[row][column] = ' ';
            getBoard()[row + 1][column + 1] = piece;
        }
    }
}