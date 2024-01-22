package jp.ac.uryukyu.ie.e235725;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ゲームボードの初期化
        ArrayList<ArrayList<Character>> initialBoard = new ArrayList<>();
        Board3x4 board3x4 = new Board3x4(initialBoard);
        board3x4.initializeBoard();

        // ゲームアクションの作成
        Action action = new Action(board3x4.board);

        try {
            // ゲームの進行
            while (true) {
                // 盤面の表示
                board3x4.displayBoard();

       
                System.out.println("どの駒を動かしますか？ 行（1-4）と列（A-C）を入力してください（例: 2B）:");
                String playerInput = scanner.next();

                // 入力を解析して行、列、および駒の種類に変換
                int row = Integer.parseInt(playerInput.substring(0, 1)) - 1;
                char column = playerInput.charAt(1);
                char piece = ' '; // 適切な駒の種類に変更してください

                // 駒の移動処理（駒の種類も指定）
                // 駒の移動処理（駒の種類も指定）
                action.movePiece(row, column, piece);


                // 移動後の盤面の表示
                board3x4.displayBoard();
            }
        } finally {
            // Scannerを閉じる
            scanner.close();
        }
    }
}
