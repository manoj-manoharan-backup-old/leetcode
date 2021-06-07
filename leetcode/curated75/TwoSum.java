package leetcode.curated75;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int compliment = target - nums[i];

            System.out.println(compliment);

            if (map.containsKey(compliment)) {

                int mapIndex = map.get(compliment);

                if (i != mapIndex) {
                    res[0] = i;
                    res[1] = mapIndex;
                    i = nums.length;
                }
            }
        }

        return res;
    }
}
