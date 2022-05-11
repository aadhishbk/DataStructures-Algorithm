class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rlist = new HashSet<>();
        Set<Integer> clist = new HashSet<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    rlist.add(i);
                    clist.add(j);
                }
            }
        }
        
        Iterator it = rlist.iterator();
        while(it.hasNext()){
            int ir= (Integer)it.next();
            for(int j=0;j<matrix[ir].length; j++)
            {
                matrix[ir][j] =0;
            }
        }
        
        Iterator itc = clist.iterator();
        while(itc.hasNext()){
            int j =(Integer) itc.next();
            for(int i=0; i<matrix.length; i++){
                   
                   matrix[i][j]=0;
                   
               }
            }
            
        
        
        
    }
}