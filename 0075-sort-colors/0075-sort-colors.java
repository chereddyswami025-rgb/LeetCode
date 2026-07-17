class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int zero=0;
        int one=0;
        int two=0;
        int pos=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }

            else{
                two++;
            }

        }

        for(int i=0;i<zero;i++)
        {
            nums[pos]=0;
            pos++;
        }

        
        for(int i=0;i<one;i++)
        {
            nums[pos]=1;
            pos++;
        }

        
        for(int i=0;i<two;i++)
        {
            nums[pos]=2;
            pos++;
        }
        
    }
}