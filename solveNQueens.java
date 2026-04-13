class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();

        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n];
        boolean[] diag2 = new boolean[2 * n];

        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        solve(0, board, result, cols, diag1, diag2, n);
        return result;
    }

    private void solve(int row, char[][] board, List<List<String>> result,
                       boolean[] cols, boolean[] diag1, boolean[] diag2, int n) {

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row + col] || diag2[row - col + n]) continue;

            board[row][col] = 'Q';
            cols[col] = diag1[row + col] = diag2[row - col + n] = true;

            solve(row + 1, board, result, cols, diag1, diag2, n);

            board[row][col] = '.';
            cols[col] = diag1[row + col] = diag2[row - col + n] = false;
        }
    }

    private List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();
        for (char[] row : board) {
            list.add(new String(row));
        }
        return list;
    }
}