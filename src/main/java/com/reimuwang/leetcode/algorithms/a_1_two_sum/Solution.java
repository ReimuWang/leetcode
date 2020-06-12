package com.reimuwang.leetcode.algorithms.a_1_two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> wishMap = new HashMap<>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      int wish = target - nums[i];
      if (wishMap.containsKey(wish)) {
        return new int[]{wishMap.get(wish), i};
      }
      wishMap.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}
