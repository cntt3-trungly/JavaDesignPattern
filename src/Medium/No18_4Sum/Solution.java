package Medium.No18_4Sum;

import java.util.*;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> list = new HashSet<>();
        if (nums.length < 4)
            return new ArrayList<>();
        for (int i = 0, k = nums.length; i < k; i++) {
            for (int j = i + 1; j < k; j++) {
                for (int l = j+1; l < k; l++) {
                    for (int m = l+1; m < k; m++){
                        if(nums[i]+nums[j]+nums[l]+nums[m]==target){
                            List<Integer> listItem = Arrays.asList(nums[i],nums[j],nums[l],nums[m]);
                            Collections.sort(listItem);
                            list.add(listItem);
                        }
                    }
                }
            }

        }
        List<List<Integer>> result = new ArrayList<>(list);
        return result;
    }
}
