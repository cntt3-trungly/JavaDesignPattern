package Easy.No1TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int lenght = nums.length;
        for ( int i =0 ; i< lenght-1;i++){
            for ( int j=i+1; j<lenght; j++){
                if(nums[i] + nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().twoSum(new int[] {2,7,11,15},9));
    }
}
