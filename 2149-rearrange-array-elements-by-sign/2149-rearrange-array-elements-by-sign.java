class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length,j=1,k=0,i=0;
        int[] res=new int[n];
        while(i<n){
         if(nums[i]>0){
                res[k]=nums[i];
                k+=2;
            }
            if(nums[i]<0){
                res[j]=nums[i];
                j+=2;
            }
            i++;
        }
        return res;
        
    }
}