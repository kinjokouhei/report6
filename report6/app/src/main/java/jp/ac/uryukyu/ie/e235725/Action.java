package jp.ac.uryukyu.ie.e235725;
import java.util.ArrayList;
import java.util.Scanner;

class Action {
    private static Scanner scanner = new Scanner(System.in);
    ArrayList<ArrayList<Character>> board;

    Action(ArrayList<ArrayList<Character>> board) {
        this.board = board;
    }

    /**
     * 指定された位置の駒を移動させる。
     * 移動方向はプレイヤーに選択させて移動処理を行う。
     *
     * @param row    移動する駒の行。
     * @param column 移動する駒の列。
     */
    public void movePiece(int row, char column, char piece) {
        // 移動方向を選択
        System.out.println("どの方向に進めますか？ (1: 上, 2: 下, 3: 左, 4: 右, 5: 右上, 6: 左上, 7: 右下, 8: 左下)");
        System.out.println("[k,K:斜め方向1歩,  z,Z:前後左右1歩,  h,H:前1歩,  l,L:全方向1歩]");
        int direction = scanner.nextInt();
    
        // 移動処理
        switch (direction) {
            case 1: goUp(row, column, piece); break;
            case 2: goDown(row, column, piece); break;
            case 3: goLeft(row, column, piece); break;
            case 4: goRight(row, column, piece); break;
            case 5: goRightUp(row, column, piece); break;
            case 6: goLeftUp(row, column, piece); break;
            case 7: goRightDown(row, column, piece); break;
            case 8: goLeftDown(row, column, piece); break;
            default:
                System.out.println("無効な入力です。");
        }
    }
    

    /**
     * 上に移動する処理
     */
    public void goUp(int row, char column, char piece) {
        
        if (row > 0) {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row - 1).set(column - 'A', currentPiece);  // 上の位置に新しい駒を配置する
    
            System.out.println("駒が上に移動しました。");
        } else {
            System.out.println("上には移動できません。");
        }
    }

    /**
     * 下に移動する処理
     */
    public void goDown(int row, char column, char piece) {

        if (row < board.size() - 1) {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row + 1).set(column - 'A', currentPiece);  // 下の位置に新しい駒を配置する
    
            System.out.println("駒が下に移動しました。");
        } else {
            System.out.println("下には移動できません。");
        }
    }
    
    /**
     * 左に移動する処理
     */
    public void goLeft(int row, char column, char piece) {

        if (column > 'A') {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row).set(column - 'A' - 1, currentPiece);  // 左の位置に新しい駒を配置する
    
            System.out.println("駒が左に移動しました。");
        } else {
            System.out.println("左には移動できません。");
        }
    }
    
    /**
     * 右に移動する処理
     */
    public void goRight(int row, char column, char piece) {

        if (column < 'C') {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row).set(column - 'A' + 1, currentPiece);  // 右の位置に新しい駒を配置する
    
            System.out.println("駒が右に移動しました。");
        } else {
            System.out.println("右には移動できません。");
        }
    }

    /**
     * 右上に移動する処理
     */
    public void goRightUp(int row, char column, char piece) {

        if (row > 0 && column < 'C') {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row - 1).set(column - 'A' + 1, currentPiece);  // 右上の位置に新しい駒を配置する
    
            System.out.println("駒が右上に移動しました。");
        } else {
            System.out.println("右上には移動できません。");
        }
    }
    
    /**
     * 左上に移動する処理
     */
    public void goLeftUp(int row, char column, char piece) {

        if (row > 0 && column > 'A') {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row - 1).set(column - 'A' - 1, currentPiece);  // 左上の位置に新しい駒を配置する
    
            System.out.println("駒が左上に移動しました。");
        } else {
            System.out.println("左上には移動できません。");
        }
    }
    
    /**
     * 右下に移動する処理
     */
    public void goRightDown(int row, char column, char piece) {

        if (row < board.size() - 1 && column < 'C') {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row + 1).set(column - 'A' + 1, currentPiece);  // 右下の位置に新しい駒を配置する
    
            System.out.println("駒が右下に移動しました。");
        } else {
            System.out.println("右下には移動できません。");
        }
    }
    
    /**
     * 左下に移動する処理
     */
    public void goLeftDown(int row, char column, char piece) {

        if (row < board.size() - 1 && column > 'A') {
            char currentPiece = board.get(row).get(column - 'A');
            board.get(row).set(column - 'A', ' ');  // 現在の位置を空白にする
            board.get(row + 1).set(column - 'A' - 1, currentPiece);  // 左下の位置に新しい駒を配置する
    
            System.out.println("駒が左下に移動しました。");
        } else {
            System.out.println("左下には移動できません。");
        }
    }
    
}