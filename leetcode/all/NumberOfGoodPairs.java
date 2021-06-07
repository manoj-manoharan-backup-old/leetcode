package leetcode.all;

import java.util.Arrays;

public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums){
        int[] count =new int[101];
        int sum=0;
        for (int num : nums) {
            int te = count[num]++;
            System.out.println("num : " + num);
            System.out.println("te : " + te);
            System.out.println("count[num] : " + count[num]);
            sum += te;
            System.out.println("sum : " + sum);
        };
        System.out.println("sum : " + sum);
        System.out.println(Arrays.toString(count));
        return sum;
    }

}
