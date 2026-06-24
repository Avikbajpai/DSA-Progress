package org.example.Problems;

public class SpecialPositionInBinaryMatrix {
    public int numSpecial(int[][] mat) {
        int i,j= 0;
        int row = mat.length;
        int coln = mat[0].length;
        int resultCount = 0;

        for(i = 0; i < row; i++){
            int sum = 0;
            for (j =0; j < coln; j++){
                int a = mat[i][j];
                if(a == 1){
                    int index = 0;
                    while(index < row){
                        sum = sum + mat[index][j];
                        index++;
                    }
                    int colIndex = 0;
                    while(colIndex < coln){
                        sum = sum + mat[i][colIndex];
                        colIndex++;
                    }
                    sum = sum - a;
                }
            }
            if(sum == 1){
                resultCount++;
            }
        }
        System.out.println(resultCount);
        return resultCount;
    }

    public int numSpecialOp(int[][] mat) {
        int i,j= 0;
        int row = mat.length;
        int coln = mat[0].length;
        int count = 0;
        int[] rowCount = new int[row];
        int[] colnCount = new int[coln];

        for(i=0; i<row; i++){
            for(j=0; j<coln; j++){
                if(mat[i][j] == 1){
                    rowCount[i]++;
                    colnCount[j]++;
                }
            }
        }
        for(i=0; i<row; i++){
            for(j=0; j<coln; j++){
                if(mat[i][j] == 1 && rowCount[i] == 1 && colnCount[j] == 1){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
