class Solution {
    public void moveZeroes(int[] nums) {
        int left=0,right=0;
        int n=nums.length;
       while(right<n){
        if(nums[right]!=0){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            
        }
        right++;
       }
        
    }
}