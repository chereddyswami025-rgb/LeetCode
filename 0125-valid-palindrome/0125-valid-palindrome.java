class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        String res=s.toLowerCase();
        int n=res.length(),left=0,right=n-1;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;    
            }
            left++;
            right--;
        }
        return true;

        
    }
}