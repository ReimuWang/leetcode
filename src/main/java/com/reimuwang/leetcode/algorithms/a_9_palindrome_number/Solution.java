package com.reimuwang.leetcode.algorithms.a_9_palindrome_number;

public class Solution {

  public boolean isPalindrome(int x) {
    if (x >= 0 && x < 10) {
      return true;
    }
    if (x < 0 || x % 10 == 0) {
      return false;
    }
    int rNum = 0;
    while (x > rNum) {
      rNum = 10 * rNum + x % 10;
      x /= 10;
    }
    return x == rNum || x == rNum / 10;
  }
}
