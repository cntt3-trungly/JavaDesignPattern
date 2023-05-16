package Medium.No1035UncrossedLines;

public class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        Integer[][] memoTable = new Integer[A.length][B.length];
        return findMaxLines(memoTable, A, B, 0, 0);
    }

    public int findMaxLines(Integer[][] memoTable, int[] A, int[] B, int i, int j) {
        //corner case
        if (i >= A.length || j >= B.length)
            return 0;

        if (memoTable[i][j] != null)
            return memoTable[i][j];

        int max = Integer.MIN_VALUE;
        if (A[i] == B[j])
            max = findMaxLines(memoTable, A, B, i + 1, j + 1) + 1;

        max = Math.max(max, findMaxLines(memoTable, A, B, i + 1, j));
        max = Math.max(max, findMaxLines(memoTable, A, B, i, j + 1));

        memoTable[i][j] = (max == Integer.MIN_VALUE) ? 0 : max;
        return memoTable[i][j];
    }

    public static void main(String[] args) {
        System.out.println( new Solution().maxUncrossedLines(new int[] {2,5,1,2,5},new int[] {10,5,2,1,5,2}));
        System.out.println( new Solution().maxUncrossedLines(new int[] {1,3,7,1,7,5},new int[] {1,9,2,5,1}));
    }
}
