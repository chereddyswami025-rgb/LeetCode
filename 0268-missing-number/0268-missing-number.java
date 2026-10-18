class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,res=0,w_sum=0,sol=0;
        for(int i=0;i<=n;i++){
            w_sum+=i;
        }
            for(int j=0;j<n;j++){
                res+=nums[j];
                 
            }
            sol=w_sum-res;
        return sol;
         
    }
}