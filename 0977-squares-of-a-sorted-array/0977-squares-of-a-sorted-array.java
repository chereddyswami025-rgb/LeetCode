class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length,left=0,right=n-1,pos=n-1;
        int[] res=new int[n];
        while(left<=right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                res[pos]=nums[left]*nums[left];
                pos--;
                left++;

            }
            else{
                res[pos]=nums[right]*nums[right];
                pos--;
                right--;

            }
        }

       return res; 
    }
}