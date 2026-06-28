package org.example.Problems;

import java.util.HashSet;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        int i,j;

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(i = 0; i < 9; i++){

            for(j = 0; j < 9; j++){
                char ch = board[i][j];
                //skip the empty cells
                if(ch == '.'){
                    continue;
                }
                //calculate box number
                int box = (i / 3) * 3 + (j / 3);

                //calculate duplicates
                if(rows[i].contains(ch) || cols[j].contains(ch) || boxes[box].contains(ch)){
                    return false;
                }
                rows[i].add(ch);
                cols[j].add(ch);
                boxes[box].add(ch);
            }
        }
        return true;
    }
}
