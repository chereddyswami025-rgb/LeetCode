class Solution {
    public boolean isPalindrome(String s) {
        String res=s.replaceAll("[^a-zA-Z0-9]","");
        String last=res.toLowerCase();
        char[] arr=last.toCharArray();
        int n=arr.length,left=0,right=n-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;    
            }
            left++;
            right--;
        }
        return true;

        
    }
}