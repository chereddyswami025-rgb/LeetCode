class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int pos=-1;
          if(n==0){
             return 0;
                 
            }
 
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                pos=i;
                break;
            }

        }
        if(pos==-1){
            pos=n;
        }

      

        for(int i=pos+1;i<n;i++){
          
            if(nums[i]!=nums[pos])
            {
                int temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                pos++;
            }
        }
            if(pos==-1||n==0){
                return 0;
            }
          
        return pos;
    }
}