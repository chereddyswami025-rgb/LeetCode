class Solution {
    public int[] twoSum(int[] numbers, int target) {
      int  n = numbers.length;
        int l = 0, r = n - 1;
        int[] res = new int[2];
        while (l < r) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            }
            if (numbers[l] + numbers[r] < target) {
                l++;
            }
            if (numbers[l] + numbers[r] == target) {
                res[0] = l + 1;
                res[1] = r + 1;
                  
                  break;

            }
        }

      return res;

    }
}