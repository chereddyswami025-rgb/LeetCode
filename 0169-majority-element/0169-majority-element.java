class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length,left=0,ex_val=0,pre_val=0,max_key=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(left<n){
            if(map.containsKey(nums[left])){
                ex_val=map.get(nums[left]);
                map.put(nums[left],ex_val+1);
            }
            else{
                map.put(nums[left],1);
            }
            left++;
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>pre_val){
                pre_val=entry.getValue();
                max_key=entry.getKey();

            }
        }

        return max_key;
    }
}