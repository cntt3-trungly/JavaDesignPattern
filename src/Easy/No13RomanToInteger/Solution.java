package Easy.No13RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);

        char[] arr = s.toCharArray();
        int n = arr.length;
        int sum = romanValue.get(arr[n-1]);
        for (int i = n - 2; i >= 0; i--){
            if (romanValue.get(arr[i]) >= romanValue.get(arr[i+1]))
                sum+= romanValue.get(arr[i]);
            else sum -= romanValue.get(arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}
