package Easy.No14LongestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        // Base condition
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
        // Find the minimum length string from the array
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }


        for (int i = 0 ; i < minimumLength ; i++) {
            char temp = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != temp) {
                    return longestCommonPrefix.toString();
                }

            }
            longestCommonPrefix.append(temp);
        }
        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }
}
