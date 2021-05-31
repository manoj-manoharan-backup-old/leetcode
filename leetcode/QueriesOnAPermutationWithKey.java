package leetcode;

public class QueriesOnAPermutationWithKey {

    private int[] permutations;

    public int[] processQueries(int[] queries, int m) {

        int[] result = new int[queries.length];

        permutations = new int[m];

        for (int i = 0; i < permutations.length; i++) {
            permutations[i] = i + 1;
        }

        for (int i = 0; i < queries.length; i++) {
            result[i]  = findItem(queries[i]);
            moveOnePlace(result[i]);
        }

        return result;
    }

    private void moveOnePlace(int index) {

        int s = permutations[index];

        for (int i = index - 1; i >= 0; i--) {
            permutations[i + 1] = permutations[i];
        }

        permutations[0] = s;
    }

    private int findItem(int item) {

        int i = 0;

        while (permutations[i] != item) {
            i++;
        }

        return i;
    }
}
