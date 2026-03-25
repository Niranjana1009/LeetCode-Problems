class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long total = 0 ;
        long ct = 0;
        long rt = 0;

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                total += grid[i][j];
            }
        }

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                rt += grid[i][j];
            }
            if(rt * 2 == total) return true ;
            if(rt * 2 > total ) break;
        }

        for(int i = 0 ; i < grid[0].length ; i++){
            for(int j = 0 ; j < grid.length ; j++){
                ct += grid[j][i];
            }
            if(ct * 2 == total) return true ;
            if(ct * 2 > total ) break;
        }
      return false;
      
    }
}