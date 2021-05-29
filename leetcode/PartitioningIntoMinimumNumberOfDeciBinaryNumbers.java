package leetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        int res = 0;
        int l = n.length();
        for (int i = 0; i < l; i++) {
            res = Math.max(res, n.charAt(i) - '0');
        }

        return res;
    }

}
