class Solution {
    public int secondHighest(String s) {
        int n=s.length(),max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
         if(Character.isDigit(ch)){
            int x=ch-'0';
            if(x>max1){
                max2=max1;
                max1=x;
            }
            if(x<max1&&x>max2){
                max2=x;
            }
            }

        }
        if(max2<0){
            return -1;
        }
        return max2;
        
    }
}