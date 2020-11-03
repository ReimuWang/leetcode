package com.reimuwang.leetcode.algorithms.a_35_search_insert_position;

public class Solution {

  public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int left = 0, right = n - 1, ans = n;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (target <= nums[mid]) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return ans;
  }
}
