package Easy.No2133CheckEveryRowColumn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean checkValid(int[][] matrix) {
        boolean check = false;
        List<Integer> numbersCheck = new ArrayList<>();
        for(int i =1; i<= matrix.length ; i++) {
            numbersCheck.add(i);
        }
        for(int i =0; i< matrix.length ; i++) {
            int a = i;
            if(numbersCheck.stream().allMatch((Integer n)-> Arrays.asList(matrix[a]).contains(n))){
                check =true;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[][] testMatrix = new int[][]{{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        System.out.println(new Solution().checkValid(testMatrix));
     }
}
