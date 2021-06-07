package leetcode.all;

public class IntegerBreak {

    public int integerBreak(final int n) {

        if (n <= 3) return n - 1;

        if (n == 4) return 4;

        int d = n;
        int e = 0;

        while (d % 3 > 0) {
            d -= 2;
            e += 2;
        }

        e = e > 0 ? e : 1;

        return (int) Math.pow(3, (float) d / 3) * e;
    }
}
