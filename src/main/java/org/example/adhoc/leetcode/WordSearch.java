package org.example.adhoc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordSearch {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    boolean res = false;
    List<String> ans = new ArrayList<>();


    public boolean isValid(int x, int y, int n, int m) {
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }

        return true;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
//        boolean[][] vis = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] vis = new boolean[m][n];
                if (word.charAt(0) == board[i][j] && !vis[i][j]) {
                    System.out.println("entries i , j = " + + i + ", " + j);
                    dfs(board, new StringBuilder(), word, i, j, m, n, vis);
                }
            }
        }

        System.out.println(ans);

        return res;
    }

    public void dfs(char[][] grid, StringBuilder sb, String word,
                    int i, int j, int m, int n, boolean[][] vis) {

        vis[i][j] = true;
        sb.append(grid[i][j]);
        boolean b = sb.toString().length() == word.length();
        if (b) {
            ans.add(new String(sb));
            return;
        }
//        if (b) {
//            return;
//        }

        for (int k = 0; k < 4; k++) {
            int x = dx[k] + i;
            int y = dy[k] + j;

            if (isValid(x, y, m, n) && vis[x][y] == false && sb.length() != word.length()) {
                char c = word.charAt(sb.length());
                char d = grid[x][y];
                if(c == d) {
                    dfs(grid, sb, word, x, y, m, n, vis);
//                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        vis[i][j] = false;
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        WordSearch obj = new WordSearch();
        char[][] grid = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        obj.exist(grid, "ABCCED");
    }
}
