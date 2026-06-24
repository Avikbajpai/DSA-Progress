package org.example.Problems;

public class NumMatrix {
    int[][] sumMatrix;

    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        sumMatrix  = new int[rows][cols];
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(r == 0 && c == 0){
                    sumMatrix[r][c] = matrix[r][c];
                }else if(r == 0){
                    sumMatrix[r][c] = matrix[r][c] + sumMatrix[r][c-1];
                }else if(c == 0){
                    sumMatrix[r][c] = matrix[r][c] + sumMatrix[r-1][c];
                }else{
                    sumMatrix[r][c] = matrix[r][c] + sumMatrix[r-1][c] + sumMatrix[r][c-1] - sumMatrix[r-1][c-1];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int i,j=0;
        int sum = 0;
        for(i = row1; i<=row2; i++){
            for(j=col1; j<=col2; j++){
                sum = sum + sumMatrix[i][j];
            }
        }
        System.out.println(row1+","+col1+","+row2+","+col2+" Sum - "+sum);
        return sum;
    }

    public int sumRegionAgain(int row1, int col1, int row2, int col2) {
        int i= row1;
        int j= col1;
        int sum = 0;
        while(i<=row2){
            sum = sum + sumMatrix[i][j];
            if(i == row2 && j == col2){
                break;
            }
            if(i == row2){
                j++;
                i = row1;
            }else{
                i++;
            }
        }
        System.out.println(row1+","+col1+","+row2+","+col2+" Sum - "+sum);
        return sum;
    }

    public int sumRegionUsingPrefixSum(int row1, int col1, int row2, int col2) {
        int i,j=0;
        int sum = 0;
        //sum = sumMatrix[4][3] - sumMatrix[4][0] - sumMatrix[1][3];
        sum = sumMatrix[row2][col2] - sumMatrix[row2][col1 - 1] - sumMatrix[row1 - 1][col2] + sumMatrix[row1 - 1][col1 - 1];
        System.out.println(row1+","+col1+","+row2+","+col2+" Sum - "+sum);
        return sum;
    }
}
