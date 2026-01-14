class Solution {
    public void setZeroes(int[][] matrix) {
        int R=matrix.length,C=matrix[0].length;
        boolean[] rows=new boolean[R];
        boolean[] cols=new boolean[C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(matrix[r][c]==0){
                    rows[r]=true;
                    cols[c]=true;
                }
            }
        }
        for(int i=0;i<R;i++){
            if(rows[i]==true){
                for(int col=0;col<C;col++){
                    matrix[i][col]=0;
                }
            }
        }

        for(int i=0;i<C;i++){
            if(cols[i]==true){
                for(int row=0;row<R;row++){
                    matrix[row][i]=0;
                }
            }
        }
    }
}