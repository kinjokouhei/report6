package jp.ac.uryukyu.ie.e235725;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class Board3x4Test {

    @Test
    void testInitializeBoard() {
        ArrayList<ArrayList<Character>> testBoard = new ArrayList<>();
        Board3x4 board = new Board3x4(testBoard);
        board.initializeBoard();

        // ボードが正しく初期化されたかを検証
        assertEquals('k', testBoard.get(0).get(0));
        assertEquals('l', testBoard.get(0).get(1));
        assertEquals('z', testBoard.get(0).get(2));
        assertEquals(' ', testBoard.get(1).get(0));
        assertEquals('h', testBoard.get(1).get(1));
        assertEquals(' ', testBoard.get(1).get(2));
        assertEquals(' ', testBoard.get(2).get(0));
        assertEquals('H', testBoard.get(2).get(1));
        assertEquals(' ', testBoard.get(2).get(2));
        assertEquals('Z', testBoard.get(3).get(0));
        assertEquals('L', testBoard.get(3).get(1));
        assertEquals('K', testBoard.get(3).get(2));
    }

    @Test
    void testDisplayBoard() {
        // ボードの表示は標準出力に行われるので、表示内容を確認するのは難しい。
        // 代わりに例外が発生しないことを確認する
        ArrayList<ArrayList<Character>> testBoard = new ArrayList<>();
        Board3x4 board = new Board3x4(testBoard);
        assertDoesNotThrow(() -> board.displayBoard());
    }
}
