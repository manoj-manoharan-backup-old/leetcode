package leetcode.all;

public class DeShuffleString {
    public String restoreString(String s, int[] indices) {

        char[] restoredStr = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            restoredStr[indices[i]] = s.charAt(i);
        }

        return new String(restoredStr);
    }
}
