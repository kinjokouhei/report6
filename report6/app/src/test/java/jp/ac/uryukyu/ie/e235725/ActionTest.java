package jp.ac.uryukyu.ie.e235725;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ActionTest {

    @Test
    void movePiece_ValidMove_ShouldUpdateBoard() {
        // テスト対象のオブジェクトを作成
        Action action = new Action();
        action.initializeBoard();

        // テスト用に設定した初期位置
        int initialRow = 2;
        int initialColumn = 1;

        // 移動先を選択
        int targetRow = 1;
        int targetColumn = 1;

        // 移動する
        action.movePiece(initialRow, initialColumn);

        // 移動後の盤
        char[][] updatedBoard = action.getBoard();

        // 移動前の位置には空白が、移動後の位置には駒が存在することを確認
        assertEquals(' ', updatedBoard[initialRow][initialColumn]);
        assertEquals('l', updatedBoard[targetRow][targetColumn]);
    }

    @Test
    void isValidPosition_ValidPosition_ShouldReturnTrue() {
        // テスト対象のオブジェクト
        Action action = new Action();

        // 有効な位置を指定
        int validRow = 2;
        char validColumn = 'B';

        // 有効な位置か検証する
        assertTrue(action.isValidPosition(validRow, validColumn));
    }

    @Test
    void isValidPosition_InvalidPosition_ShouldReturnFalse() {
        // テスト対象のオブジェクトを作成
        Action action = new Action();

        // 無効な位置を指定
        int invalidRow = 4;
        char invalidColumn = 'D';

        // 無効な位置かどうかを検証
        assertFalse(action.isValidPosition(invalidRow, invalidColumn));
    }
}