class Solution {
    public int findNumbers(int[] nums) {;
        int e_cnt=0;
        for(int i=0;i<nums.length;i++){
          int n= nums[i];
           int cnt=0;
            while(n!=0){
                cnt++;
                n/=10;
            }

            if(cnt%2==0){
                e_cnt+=1;
            }
        }
       return e_cnt; 
    }
}