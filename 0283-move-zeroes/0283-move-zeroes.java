class Solution {
    public void moveZeroes(int[] nums) {
        int pos=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
               pos=i;
               break;
        }}

     
        int temp=0;
        for(int i=pos+1;i<nums.length;i++)
        {
            if(pos==-1){
                break;
            }
            if(nums[i]!=0){
               temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                pos++;
            }
            
        }
            

        
        
    }
}