package com.reimuwang.leetcode.algorithms.a_225_implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

  private Queue<Integer> queueMain = new LinkedList<>();

  private Queue<Integer> queueBackup = new LinkedList<>();

  private int top;

  /** Initialize your data structure here. */
  public MyStack() {

  }

  /** Push element x onto stack. */
  public void push(int x) {
    queueMain.offer(x);
    top = x;
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    while (queueMain.size() > 1) {
      top = queueMain.poll();
      queueBackup.offer(top);
    }
    int result = queueMain.poll();
    queueMain = queueBackup;
    queueBackup = new LinkedList<>();
    return result;
  }

  /** Get the top element. */
  public int top() {
    return top;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return queueMain.isEmpty();
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
