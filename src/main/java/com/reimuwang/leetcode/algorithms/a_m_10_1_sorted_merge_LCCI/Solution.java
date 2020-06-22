package com.reimuwang.leetcode.algorithms.a_m_10_1_sorted_merge_LCCI;

public class Solution {

  public void merge(int[] A, int m, int[] B, int n) {
    int startIndex = 0;
    for (int i = 0; i < n; i++) {
      startIndex = merge(A, B[i], m + i, startIndex);
    }
  }

  private int merge(int[] a, int e, int cl, int startIndex) {
    for (int i = startIndex; i < cl; i++) {
      if (e >= a[i]) {
        continue;
      }
      for (int j = cl - 1; j >= i; j--) {
        a[j + 1] = a[j];
      }
      a[i] = e;
      return i++;
    }
    a[cl] = e;
    return cl++;
  }
}
