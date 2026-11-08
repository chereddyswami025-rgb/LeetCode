class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex+=1;
        List<Integer> list=new ArrayList<>();
       
        for(int i=0;i<rowIndex;i++){
            list.add(ncr(rowIndex,i+1));
        } 
        return list;
    }
    public int ncr(int r,int c){
        r-=1;c-=1;
        long res=1;
    for(int i=0;i<c;i++){
        res=res*(r-i);
        res=res/(i+1); 
    }
    return (int) res;
    }
}