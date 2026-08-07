class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0,max=0;
        int m=accounts.length;

        for(int i=0;i<m;i++){
            sum=0;
            int n=accounts[i].length;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
           max= Math.max(max,sum);
        }
        return max;
    }
}