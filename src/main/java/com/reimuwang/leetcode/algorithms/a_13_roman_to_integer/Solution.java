package com.reimuwang.leetcode.algorithms.a_13_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  private static Map<Character, Integer> C_MAP = new HashMap<>(7);

  static {
    C_MAP.put('I', 1);
    C_MAP.put('V', 5);
    C_MAP.put('X', 10);
    C_MAP.put('L', 50);
    C_MAP.put('C', 100);
    C_MAP.put('D', 500);
    C_MAP.put('M', 1000);
  }

  public int romanToInt(String s) {
    int result = 0;
    boolean skip = false;
    char[] charArray = s.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
      int num = C_MAP.get(charArray[i]);
      if (skip) {
        result = result + num - C_MAP.get(charArray[i - 1]);
        skip = false;
        continue;
      }
      if (i == charArray.length - 1) {
        result = result + num;
        break;
      }
      int nextNum = C_MAP.get(charArray[i + 1]);
      if (num < nextNum) {
        skip = true;
        continue;
      }
      result = result + num;
    }
    return result;
  }
}
