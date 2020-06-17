package com.reimuwang.leetcode.algorithms.a_20_valid_parentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

  private static Map<Character, Character> KEY_MAP = new HashMap<>(3);

  static {
    KEY_MAP.put(')', '(');
    KEY_MAP.put('}', '{');
    KEY_MAP.put(']', '[');
  }

  public boolean isValid(String s) {
    if (s.length() == 0) {
      return true;
    }
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (!KEY_MAP.containsKey(c)) {
        stack.push(c);
        continue;
      }
      if (stack.isEmpty()) {
        return false;
      }
      if (!KEY_MAP.get(c).equals(stack.pop())) {
        return false;
      }
    }
    return stack.isEmpty();
  }
}
