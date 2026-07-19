class Solution {
    public int[] sortedSquares(int[] nums) {
      int n=nums.length;
      int l=0, r=n-1;
    int[] res=new int[n];
      int pos=n-1;
      while(l<=r){
        if(nums[l]*nums[l]>nums[r]*nums[r]){
            res[pos]=nums[l]*nums[l];
            pos--;
            l++;
        }
        else{
              res[pos]=nums[r]*nums[r];
              pos--;
              r--;

        }

      }
      return res;
        
    }
}