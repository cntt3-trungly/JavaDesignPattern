package Medium.No1456MaximumNumberOfVowels;

import java.util.List;

public class Solution {
    public int maxVowels(String s, int k) {
        List<Character> vowels = List.of('e', 'u', 'i', 'o', 'a');
        int max = 0;
        if (s.length() < k) return 0;

        for (int i = 0; i <= s.length() - k; i++) {
            int count = 0;
            int temp = i;
            while (temp < i + k) {
                if (vowels.contains(s.charAt(temp))) {
                    count++;
                }
                temp++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxVowels("leetcode",3));
    }
}
