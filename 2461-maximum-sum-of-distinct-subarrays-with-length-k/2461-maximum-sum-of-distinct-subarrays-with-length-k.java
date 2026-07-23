class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right=0;
        long max=0,sum=0;
         while(right<nums.length){
            sum+=nums[right];
            if(map.containsKey(nums[right]))
            {
                int exval=map.get(nums[right]);
                map.put(nums[right],exval+1);
            }
            else{
                map.put(nums[right],1);
            }
        if(right-left+1==k){
            if(map.size()==k){
                max=Math.max(sum,max);
                sum-=nums[left];           
                // map.put(nums[left],0);
                int pre_val=map.get(nums[left]);
                    map.put(nums[left],pre_val-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
            }
            else{
                  sum-=nums[left];
                  int pre_val=map.get(nums[left]);
                    map.put(nums[left],pre_val-1);
                   if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
            }
                left++;
            
        }
        right++;
         }
        
       return max;  
    }
        
    }
