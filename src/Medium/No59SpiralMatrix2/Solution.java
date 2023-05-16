package Medium.No59SpiralMatrix2;

public class Solution {
    public int[][] generateMatrix(int n) {
        int [][] result = new int[n][n];
        boolean isRight = true;
        boolean isLeft = false;
        boolean isDown = false;
        boolean isUp = false;
        int count =1;
        int top = 0, bottom = n, left = 0, right = n;
        while (top<bottom && left<right) {
            if(isRight) {
                for(int i = left ;i< right;i++){
                    result[top][i] = count;
                    count++;
                }
                isRight = false;
                isDown = true;
                top++;
                continue;
            }
            if(isDown) {
                for(int i = top ;i<bottom;i++){
                    result[i][right-1] = count;
                    count++;
                }
                isDown = false;
                isLeft = true;
                right--;
                continue;
            }

            if(isLeft) {
                for(int i = right-1 ; i>=left ;i--){
                    result[bottom-1][i]= count;
                    count++;
                }
                isLeft = false;
                isUp = true;
                bottom--;
                continue;
            }

            if(isUp) {
                for(int i = bottom-1 ;i>=top;i--){
                    result[i][left] = count;
                    count++;
                }
                isUp = false;
                isRight = true;
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] result = new Solution().generateMatrix(3);
        for (int[] n : result) {
            for (int a : n) {
                System.out.println(a);
            }
        }
    }
}
