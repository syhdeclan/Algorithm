package Year2021.January;

import java.util.HashSet;
import java.util.Set;

public class PathInRectangle {

    boolean exist = false;
    boolean[][] map;

    public boolean exist(char[][] board, String word) {
        map = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    map[i][j] = true;
                    findNextChar(word, 1, board, i, j);
                    map[i][j] = false;
                }
            }
        }

        return exist;
    }

    public void findNextChar(String word, int index, char[][] board, int nowRow, int nowPos) {
        if (exist){
            return;
        }
        if (index == word.length()) {
            exist = true;
            return;
        }
        if (nowRow - 1 >= 0) {
            if (word.charAt(index) == board[nowRow - 1][nowPos] && !map[nowRow - 1][nowPos]) {
                map[nowRow - 1][nowPos] = true;
                findNextChar(word, index + 1, board, nowRow - 1, nowPos);
                map[nowRow - 1][nowPos] = false;
            }
        }
        if (nowRow + 1 < board.length) {
            if (word.charAt(index) == board[nowRow + 1][nowPos] && !map[nowRow + 1][nowPos]) {
                map[nowRow + 1][nowPos] = true;
                findNextChar(word, index + 1, board, nowRow + 1, nowPos);
                map[nowRow + 1][nowPos] = false;
            }
        }
        if (nowPos - 1 >= 0) {
            if (word.charAt(index) == board[nowRow][nowPos - 1] && !map[nowRow][nowPos - 1]) {
                map[nowRow][nowPos - 1] = true;
                findNextChar(word, index + 1, board, nowRow, nowPos - 1);
                map[nowRow][nowPos - 1] = false;
            }
        }
        if (nowPos + 1 < board[0].length) {
            if (word.charAt(index) == board[nowRow][nowPos + 1] && !map[nowRow][nowPos + 1]) {
                map[nowRow][nowPos + 1] = true;
                findNextChar(word, index + 1, board, nowRow, nowPos + 1);
                map[nowRow][nowPos + 1] = false;
            }
        }
    }

    public static void main(String[] args) {
        PathInRectangle pathInRectangle = new PathInRectangle();
        char[][] word = {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        pathInRectangle.exist(word,"abcced");
        System.out.println(pathInRectangle.exist);
    }

}
