import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int length = nums.length;
    //     for (int i = 0; i < length; i++) {
    //         for (int j = i + 1; j < length; j++) {
    //             if (nums[i] + nums[j] == target) {
    //                 return new int[] { i, j };
    //             }
    //         }
    //     }
    //     return new int[0];
    // }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int difference = target -  nums[i];
            if(map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }else{
                map.put(Integer.valueOf(nums[i]),Integer.valueOf(i));
            }
        }
        return new int[0];
    }
}
// @lc code=end
