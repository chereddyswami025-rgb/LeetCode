class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,w_sum=0,sol=0;
        for(int i=0;i<=n;i++){
            w_sum+=i;
        }
            for(int j=0;j<n;j++){
                w_sum-=nums[j];
                 
            }
        
        return w_sum;
         
    }
}