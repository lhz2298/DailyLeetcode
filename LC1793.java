class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int i = k - 1, j = k + 1;
        int ans = nums[k], min = nums[k];
        while(i >= 0 || j < n) {
            int v1 = 0, v2 = 0;
            int min1 = min, min2 = min;
            if(i >= 0) {
                min1 = Math.min(min, nums[i]);
                v1 = min1 * (j - i);
            }
            if(j < n) {
                min2 = Math.min(min, nums[j]);
                v2 = min2 * (j - i);
            }
            if(v1 > v2) {
                --i;
                ans = Math.max(v1, ans);
                min = Math.min(min1, min);
            }
            else {
                ++j;
                ans = Math.max(v2, ans);
                min = Math.min(min, min2);
            }
        }
        return ans;
    }
}
