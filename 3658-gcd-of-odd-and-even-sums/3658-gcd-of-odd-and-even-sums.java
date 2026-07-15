class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum_odd=0;
        int sum_even=0;
        for(int i=1;i<=2*n;i++)
        {
            if(i%2==0){
                sum_even+=i;
            }
            else{
                sum_odd+=i;
            }
        }
        int min=sum_even;
        if(sum_odd<min){
            min=sum_odd;
        }
        int max=0;
        for(int i=1;i<=min;i++){
            if(sum_odd%i==0&&sum_even%i==0)
            {
                max=i;
            }
        }


     return max;   
    }
}