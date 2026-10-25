class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,w_sum=0,sol=0;
        w_sum=(n*(n+1))/2;
            for(int j=0;j<n;j++){
                w_sum-=nums[j];
                 
            }
        
        return w_sum;
         
    }
}