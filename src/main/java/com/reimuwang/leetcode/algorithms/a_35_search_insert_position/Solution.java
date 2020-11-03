package com.reimuwang.leetcode.algorithms.a_35_search_insert_position;

public class Solution {

  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int result = nums.length;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (target > nums[mid]) {
        left = mid + 1;
        continue;
      }
      result = mid;
      right = mid - 1;
    }
    return result;
  }
}
