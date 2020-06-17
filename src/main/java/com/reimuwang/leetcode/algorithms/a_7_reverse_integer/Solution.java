package com.reimuwang.leetcode.algorithms.a_7_reverse_integer;

public class Solution {

  public int reverse(int x) {
    int result = 0;
    int m = 10;
    while (x >= m || x <= -1 * m) {
      result = m * result + x % m;
      x /= m;
    }
    int tempResult = m * result + x;
    return (tempResult - x) / m == result ? tempResult : 0;
  }
}
