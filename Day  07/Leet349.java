class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>seen = new HashSet<>();
        //seen or R, name can be any
        HashSet<Integer> R = new HashSet<>();

        for (int num : nums1) seen.add(num);
        for (int num : nums2){
            if (seen.contains(num)) R.add(num);
        }
        
        int[] ans = new int [R.size()];
        int i = 0;

        for (int num:R){
            ans[i++] = num;
        }
        return ans;
    }
}
