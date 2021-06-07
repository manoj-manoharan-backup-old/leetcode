package leetcode.all;

public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] s = new int[nums.length];

        for (int i = 0; i < n; i++) {
            s[i*2] = nums[i];
            s[i*2 + 1] = nums[i + n];
        }

        return s;
    }

}
