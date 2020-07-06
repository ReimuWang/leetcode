package com.reimuwang.leetcode.algorithms.a_26_remove_duplicates_from_sorted_array;

public class Solution {

  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }
    int validIndex = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[validIndex] == nums[i]) {
        continue;
      }
      validIndex++;
      if (i == validIndex) {
        continue;
      }
      nums[validIndex] = nums[i];
    }
    return ++validIndex;
  }
}
