package leetcode.curated75;

import java.util.HashMap;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int f = 0; // front index

        while (f < nums.length) {

            if (map.containsKey(nums[f])) {
                return true;
            }
            map.put(nums[f], 0);

            f++;
        }

        return false;

    }
}
