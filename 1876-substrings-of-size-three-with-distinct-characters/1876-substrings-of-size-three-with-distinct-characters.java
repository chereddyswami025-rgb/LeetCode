class Solution {
    public int countGoodSubstrings(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,right=0,cnt=0,sum=0;
        while(right<arr.length){
            if(map.containsKey(arr[right])){
                int ex_val=map.get(arr[right]);
                map.put(arr[right],ex_val+1);
            }
            else{
                map.put(arr[right],1);
            }

            if(right-left+1==3){


                if(map.size()==3){
                    cnt++;
                int ex_val=map.get(arr[left]);
                map.put(arr[left],ex_val-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }

                }
                else{

                     int ex_val=map.get(arr[left]);
                map.put(arr[left],ex_val-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }

                }
                left++;
            }

            right++;

        }

        return cnt;
        
    }
}
