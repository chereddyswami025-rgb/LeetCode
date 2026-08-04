class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0,right=0,n=nums.length;
        long max=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            sum+=nums[right];
            if(map.containsKey(nums[right])){
                int ex=map.get(nums[right]);
                map.put(nums[right],ex+1);

            }
            else{
                 map.put(nums[right],1);
            }
           
            if(right-left+1==k){
                if(map.size()!=k){
                    sum-=nums[left];
                     int le=map.get(nums[left]);
                    map.put(nums[left],le-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                    left++;
                }
                 if(map.size()==k){
                max= Math.max(sum,max);
                sum-=nums[left];
                int l=map.get(nums[left]);
                map.put(nums[left],l-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;


            }
           
              
            }
            right++;
        }
        return max;
        
    }
}