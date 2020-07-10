package com.reimuwang.leetcode.algorithms.a_27_remove_element;

public class Solution {

  public int removeElement(int[] nums, int val) {
    int validLength = nums.length;
    int i = 0;
    while (i < validLength) {
      if (nums[i] == val) {
        nums[i] = nums[validLength - 1];
        validLength--;
      } else {
        i++;
      }
    }
    return validLength;
  }
}
