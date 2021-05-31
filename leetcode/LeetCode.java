package leetcode;

import java.util.Arrays;

public class LeetCode {

    public static void main(String[] args) {

        int[] queries = {7,5,5,8,3}; int m = 8;

        System.out.println(Arrays.toString((new QueriesOnAPermutationWithKey()).processQueries(queries, m)));
    }
}
