class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0,right=0,sum=0;
        while(right<fruits.length)
        {   

            if(map.containsKey(fruits[right])){
               int ex_val=map.get(fruits[right]);
               map.put(fruits[right],ex_val+1);
            }
            else{
                map.put(fruits[right],1);
            }
            if(map.size()>2){
                int  ex_val=map.get(fruits[left]);
                map.put(fruits[left],ex_val-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            right++;

        }
        for(Integer val:map.values()){
            sum+=val;
        }
        return sum ;

    }
}