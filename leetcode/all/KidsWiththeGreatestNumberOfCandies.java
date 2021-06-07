package leetcode.all;

import java.util.ArrayList;
import java.util.List;

class KidsWiththeGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(final int[] candies, final int extraCandies) {

        int largestNumber = -1;

        for (int candy : candies) {
            largestNumber = Math.max(largestNumber, candy);
        }

        List<Boolean> candiesGreatest = new ArrayList<>(candies.length);

        for (int candy : candies) {
            candiesGreatest.add(candy + extraCandies >= largestNumber);
        }

        return candiesGreatest;
    }
}
