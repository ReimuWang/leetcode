package com.reimuwang.leetcode.algorithms.a_14_longest_common_prefix;

public class Solution {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return "";
    }
    if (strs.length == 1) {
      return strs[0];
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < strs[0].length(); i++) {
      char base = strs[0].charAt(i);
      boolean isBreak = false;
      for (int j = 1; j < strs.length; j++) {
        if (strs[j].length() <= i) {
          isBreak = true;
          break;
        }
        char temp = strs[j].charAt(i);
        if (base != temp) {
          isBreak = true;
          break;
        }
      }
      if (isBreak) {
        break;
      }
      result.append(base);
    }
    return result.toString();
  }
}
