class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int eve=0,od=0;
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            int digit=ch-'0';
            if(i%2==0){
                eve+=digit;
            }
            else{
                od+=digit;
            }
        }
        if(eve!=od){
            return false;
        }  
        return true;  
    }
}