package Easy.No1822SignProductArray;

public class Solution {
    public int arraySign(int[] nums) {
        long product = 1;
        for (int n : nums) {
            product *=n;
        }
        System.out.println(product);
        if (product == 0 || nums.length == 0) return 0;
        if (product > 0) return 1;
        else return -1;
    }

}
