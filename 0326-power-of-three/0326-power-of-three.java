class Solution {
    public boolean isPowerOfThree(int n) {

        if(n%2==0){
            return false;
        }
        int m=n;
        int sum=0;
        while(m>0){
            int rem=m%10;
            sum+=rem;
            m/=10;
        }
        if(sum%3!=0&&n!=1){
            return false;

        }

        if(n==3||n==1)
        {
            return true;
        }

        return isPowerOfThree(n/3);
    }
}