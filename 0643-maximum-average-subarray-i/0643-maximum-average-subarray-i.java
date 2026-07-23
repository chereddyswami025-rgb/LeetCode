class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0,right=0,sum=0;
        double max=Integer.MIN_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            if(right-left+1==k){
                max=Math.max(max,sum);
                sum-=nums[left];
                left++;
            }
            
            right++;
        }
        return max/k;
        
    }
}