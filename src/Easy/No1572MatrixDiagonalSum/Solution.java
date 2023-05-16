package Easy.No1572MatrixDiagonalSum;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int indexCenter = mat.length / 2;
        for (int i = 0; i < mat.length; i++) {
            if (i == indexCenter && mat.length % 2 != 0) {
                sum += mat[indexCenter][indexCenter];
            } else {
                sum += mat[i][i] + mat[i][mat.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] testMatrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(new Solution().diagonalSum(testMatrix));
    }
}
