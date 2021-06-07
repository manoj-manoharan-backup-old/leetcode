package leetcode.all;

class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

    public int[] minOperations(String boxes) {

        int l = boxes.length();
        int lIndex = boxes.length() - 1;

        int[] lr = new int[l];
        int lC = 0;

        int[] rl = new int[l];
        int rC = 0;

        char[] boxArr = boxes.toCharArray();

        int[] res = new int[l];

        for (int i = 0; i < l; i++) {

            if (i > 0) {
                // Left box
                if (boxArr[i - 1] == '1') {
                    lC++;
                }

                lr[i] = lr[i - 1] + lC;
                res[i] += lr[i];
            }

            if (lIndex - i < lIndex) {

                // Right box
                if (boxArr[lIndex - i + 1] == '1') {
                    rC++;
                }

                rl[lIndex - i] = rl[lIndex - i + 1] + rC;
                res[lIndex - i] += rl[lIndex - i];
            }
        }

        return res;
    }
}