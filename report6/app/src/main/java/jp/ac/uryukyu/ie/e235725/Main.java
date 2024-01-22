package jp.ac.uryukyu.ie.e235725;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board3x4 board = new Board3x4();
        board.initializeBoard();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.displayBoard();
            System.out.println("次に進める駒を選んでください（例: A2）");

            String move = scanner.next();
            char column = move.charAt(0);
            int row = Integer.parseInt(move.substring(1)) - 1;

            Action actionInstance = new Action();
            actionInstance.initializeBoard();; // Action クラスにボードをセット

            if (actionInstance.isValidPosition(row, column)) {
                actionInstance.movePiece(row, column);
            } else {
                System.out.println("無効な駒の選択です。");
            }

            //if (board.isGameOver()) {
                //System.out.println("ゲーム終了！");
                //break;
            }
        }

        //scanner.close();
    }
//}