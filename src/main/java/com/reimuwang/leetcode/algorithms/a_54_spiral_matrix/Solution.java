package com.reimuwang.leetcode.algorithms.a_54_spiral_matrix;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    if (null == matrix || matrix.length == 0) {
      return result;
    }
    int maxRSize = matrix.length;
    int maxCSize = matrix[0].length;
    Point maxPoint = new Point(maxRSize - 1, maxCSize - 1);
    boolean[][] visitMatrix = new boolean[maxRSize][maxCSize];
    int direc = 0;  // 0-右 1-下 2-左 3-上
    Point point = new Point(0, 0);
    for (int i = 0; i < maxRSize * maxCSize; i++) {
      // 输出当前节点
      result.add(matrix[point.x][point.y]);
      visitMatrix[point.x][point.y] = true;
      // 确定下一个节点
      Point wishPoint = getWishPoint(point, direc);
      if (check(maxPoint, visitMatrix, wishPoint)) {
        point = wishPoint;
        continue;
      }
      direc++;
      if (direc == 4) {
        direc = 0;
      }
      point = getWishPoint(point, direc);
    }
    return result;
  }

  private Point getWishPoint(Point point, int direc) {
    int wishX = point.x;
    int wishY = point.y;
    if (direc == 0) {
      wishY++;
    } else if (direc == 1) {
      wishX++;
    } else if (direc == 2) {
      wishY--;
    } else {
      wishX--;
    }
    return new Point(wishX, wishY);
  }

  private boolean check(Point maxPoint, boolean[][] visitMatrix, Point wishPoint) {
    return wishPoint.x >= 0 &&
           wishPoint.y >= 0 &&
           wishPoint.x <= maxPoint.x &&
           wishPoint.y <= maxPoint.y &&
           !visitMatrix[wishPoint.x][wishPoint.y];
  }
}
