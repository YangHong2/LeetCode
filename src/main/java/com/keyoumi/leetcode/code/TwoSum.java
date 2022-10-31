package com.keyoumi.leetcode.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: Ke Youmi
 * @Date: 2022/10/31 - 10 - 31 - 17:06
 * @Description: com.keyoumi.leetcode.code
 * @version: 1.0
 */
/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] ans = new int[2];
        for (int i = 0,j = nums.length - 1;i <= j;i++,j--){
            if (nums[i] + nums[j] == target) return new int[]{j, i};
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            if (map.containsKey(target-nums[j])){
                return new int[]{map.get(target-nums[j]), j};
            }
            map.put(nums[i], i);
            map.put(nums[j], j);
        }
        return null;
    }
}
