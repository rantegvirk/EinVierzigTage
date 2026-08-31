// Reshape the matrix
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][] = new int[r][c];
        
        int row = mat.length;
        int col = mat[0].length;

        //track that we're not passing array limits/(no.of values)
        if (row*col != r*c){
            return mat;}

        //now main work
        int indexRow = 0;
        int indexCol = 0;
        for (int i=0; i<row; i++){
            for (int j=0; j<col;j++){
                arr[indexRow][indexCol++] = mat[i][j];
                
                if (indexCol == c){
                    indexRow++;
                    indexCol = 0;
                }
            }
        }
        return arr;



    }
}
