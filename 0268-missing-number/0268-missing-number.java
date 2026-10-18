class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length,res=0,se=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                res=nums[j];
                if(i==nums[j]){
                    break;
                }
            }
            if(i!=res){
                se=i;
                break;

            }
        }
        return se;
         
    }
}