class Solution {
    public int orangesRotting(int[][] grid) {
        int[][]  dir = {{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
       int fresh=0,time=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                  q.add(new int[] {i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }               
            }
        }
         if (fresh == 0)
            return time;

        while(!q.isEmpty()){
            time++;
            int size = q.size();
            for(int i=0;i<size;i++){
                 int[] temp = q.poll();

                 for(int[] p : dir){
                    int r = temp[0]+p[0];
                    int c = temp[1]+p[1];
                    

                    if(r>=0 && c>=0 && r<grid.length && c<grid[0].length && grid[r][c]==1){
                        fresh--;
                        grid[r][c]=2;
                        q.offer(new int[] {r,c});
                    }
                    if(fresh==0){
                        return time;
                    }
                 }
            }
        }
        return fresh==0?time:-1;
        
        
    }
    
}