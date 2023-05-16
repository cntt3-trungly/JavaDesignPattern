package Medium.No6ZigzagConversion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> rowString = new ArrayList<>();
        int rowCount = 0;
        for (int i = 0; i < numRows; i++)
            rowString.add(new StringBuilder());

        boolean isDown = false;
        char[] words = s.toCharArray();
        for (int i = 0; i < words.length; i++) {
            rowString.get(rowCount).append(words[i]);
            if(rowCount == 0 || rowCount == numRows - 1) isDown = !isDown;
            rowCount += isDown ? 1 : -1;
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rowString) ret.append(row);
        return ret.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convert("PAYPALISHIRING", 3));
    }
}
