class Solution {
    // Define the size of the grid
    public static final int N = 9;

    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] columns = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        // Implement empty maps for storing values of sudoku
        for(int i = 0; i < N; i++) {
            rows[i] = new HashSet<Character>();
            columns[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                char value = board[i][j];

                // Check for empty field
                if(value == '.') {
                    continue;
                }

                // Check rows
                if(rows[i].contains(value)) {
                    return false;
                }
                rows[i].add(value);

                // Check columns
                if(columns[j].contains(value)) {
                    return false;
                }
                columns[j].add(value);

                // Check boxes
                int boxIndex = (i / 3) * 3 + (j / 3);
                if(boxes[boxIndex].contains(value)) {
                    return false;
                }
                boxes[boxIndex].add(value);
            }
        }
        return true;
    }
}
