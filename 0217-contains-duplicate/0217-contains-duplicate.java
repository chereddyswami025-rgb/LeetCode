import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> ob=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(ob.containsKey(n))
            {
                int prev=ob.get(n);
                ob.put(n,prev+1);

            }
            else{
                ob.put(n,1);
            }
        }

        for(int k:ob.keySet()){
            if(ob.get(k)>1){
                return true;
            }
        }
    return false;
    }
}
