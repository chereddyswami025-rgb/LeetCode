class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int pos=0;
         for(int i=1;i<n;i++){
            if(nums[pos]!=nums[i])
            {
                pos++;
                nums[pos]=nums[i];
            }


        }

        return pos+1;

        
    }
}