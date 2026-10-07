import java.util.ArrayList;
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows=new ArrayList<>();
        ArrayList<Integer> columns=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }
        for(int row:rows){
            for(int i=0;i<matrix[0].length;i++) matrix[row][i]=0;
        }
        for(int column:columns){
            for(int i=0;i<matrix.length;i++){
                matrix[i][column]=0;
            }
        }
    }
}