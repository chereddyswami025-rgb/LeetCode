class Solution {
    public boolean isPowerOfFour(int n) {
       
        if (n == 1) {
            return true;
        }

        if (n % 2 != 0 || n == 0) {
            return false;
        }

        // int m = n;
        // int rev = 0;

        // int cnt = 0;
        // while (m != 0) {
        //     int rem = m % 10;
        //     rev = rev * 10 + rem;
        //     m /= 10;
        //     if (cnt == 2) {
        //         break;
        //     }
        // }

        // int l = 0;
        // while (rev != 0) {
        //     int r = rev % 10;
        //     l = l * 10 + r;
        //     rev /= 10;
           
             

        // }

        if (n % 4 != 0) {
            return false;
        }

    

        return isPowerOfFour(n/ 4);

    }
}