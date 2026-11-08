class Solution {
    public List<List<Integer>> generate(int numRows) {
       int n=numRows;
       List<List<Integer>> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
        List<Integer> temp=new ArrayList<>();
            for(int j=1;j<=i;j++){
                temp.add(ncr(i,j));
            }
                
        list.add(temp);
        }

    
        return list;
        
    }
        public int ncr(int r,int c){
            r-=1;c-=1;
            int res=1;
            for(int i=0;i<c;i++){
                res=res*(r-i);
                res=res/(i+1);
            }
            return res;

        }
}