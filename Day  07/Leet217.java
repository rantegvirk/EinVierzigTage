import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int element: nums){
            set.add(element);
        }  
            
        if (set.size()==nums.length){
        return false;
        }
        else{
            return true;
        }

        
    }
}
