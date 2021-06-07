package leetcode.all;

import netscape.javascript.JSObject;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class HowManyNumbersAreSmaller {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] sorted = Arrays.stream(nums).sorted().toArray();

        int[] smallerCount = new int[sorted[sorted.length - 1] + 1];

        for (int i = sorted.length - 1; i >= 0; i--) {
            smallerCount[sorted[i]] = i;
        }

        int[] numSmaller = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numSmaller[i] = smallerCount[nums[i]];
        }

        return numSmaller;
    }
}
