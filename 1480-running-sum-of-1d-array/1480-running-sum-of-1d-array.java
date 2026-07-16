class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum=new int[nums.length];
        int prev=0;
        for(int i=0;i<nums.length;i++)
        {
        sum[i]=sum[i]+nums[i]+prev; 
        prev=sum[i];
        }

    
    return sum;
}
}