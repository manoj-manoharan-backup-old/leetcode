package leetcode;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int jSum = 0;
            for (int jInt : account) jSum += jInt;
            maxWealth = Math.max(maxWealth, jSum);
        }
        return maxWealth;
    }
}
