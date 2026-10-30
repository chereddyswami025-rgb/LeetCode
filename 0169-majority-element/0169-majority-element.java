class Solution {
    public int majorityElement(int[] nums) {
        int major,cnt=0,n=nums.length;
        major=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==major){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt==0){
                major=nums[i+1];
                if(i==n-1){
                    break;
                }
            }
        }
        return major;
    }
}