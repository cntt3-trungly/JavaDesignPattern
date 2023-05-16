package Medium.No54SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        boolean isRight = true;
        boolean isLeft = false;
        boolean isDown = false;
        boolean isUp = false;
        int top = 0, bottom = matrix.length, left = 0, right = matrix[0].length;
        while (top<bottom && left<right) {
            if(isRight) {
                for(int i = left ;i< right;i++){
                    result.add(matrix[top][i]);
                }
                isRight = false;
                isDown = true;
                top++;
                continue;
            }

            if(isDown) {
                for(int i = top ;i<bottom;i++){
                    result.add(matrix[i][right-1]);
                }
                isDown = false;
                isLeft = true;
                right--;
                continue;
            }

            if(isLeft) {
                for(int i = right-1 ; i>=left ;i--){
                    result.add(matrix[bottom-1][i]);
                }
                isLeft = false;
                isUp = true;
                bottom--;
                continue;
            }

            if(isUp) {
                for(int i = bottom-1 ;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                isUp = false;
                isRight = true;
                left++;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int [][] testArray = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(new Solution().spiralOrder(testArray));
    }
}
