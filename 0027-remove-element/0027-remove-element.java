class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length,left=0,right=0;
        while(right<n){
            if(nums[right]!=val){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
            right++;
        }
        return left;
        
    }
}