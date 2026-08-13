class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int eve=0,od=0;
        for(int i=0;i<n;i++){
            
            int digit=num.charAt(i)-'0';
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