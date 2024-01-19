
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Board3x4 board = new Board3x4();
        board.initializeBoard();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.displayBoard();
            System.out.println("次に進める駒を選んでください（例: A2）");//：を消した
            
            String move = scanner.next();

            Action actionInstance = new Action();
            actionInstance.goAhead();

            if (isValidMove(move)) {
                if (board.makeMove(move)) {
                    System.out.println("移動に成功！");
                } else {
                    System.out.println("無効な移動です。もう一度やり直してください。");
                }
            } else {
                System.out.println("無効な入力です。正しい形式で入力してください（例: A2）");
            }

            if (board.isGameOver()) {
                System.out.println("ゲーム終了！");
                break;
            }
        }

        scanner.close();
    }

    private static boolean isValidMove(String move) {
        // 入力が正しい形式かどうかを確認するための簡単な実装
        return move.matches("[A-C][1-4]");
    }
}

