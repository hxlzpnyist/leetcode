package com.hxlzpnyist.site.leetcode.array;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * @url https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {

    /**
     * 采用暴力遍历方式实现，时间复杂度 O(n2) = n*(n+1)/2
     *
     * @param heights Y 轴的边高度
     */
    public static int solution (int[] heights) {
        // 临时变量用于记录最大的面积值
        int tempMaxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                // 取 Y 轴最小的边
                int y = heights[i] > heights[j] ? heights[j] : heights[i];
                int x = j - i;

                //System.out.println("左边 : " + heights[i] + ", 右边 : " + heights[j] + ", 面积 : " + (x * y));

                tempMaxArea = Math.max(tempMaxArea, x * y);
            }
        }

        return tempMaxArea;
    }

    public static int solution1 (int[] heights) {
        int tempMaxArea = 0;
        int leftIndex = 0, rightIndex = heights.length - 1;

        // 左指针向右移动
        // 右指针向左移动
        // 双指针交汇时终止循环
        while (leftIndex < rightIndex) {
            tempMaxArea = Math.max(tempMaxArea, Math.min(heights[leftIndex], heights[rightIndex]) * (rightIndex - leftIndex));

            if (heights[leftIndex] > heights[rightIndex]) {
                rightIndex--;
            } else {
                leftIndex++;
            }
        }

        return tempMaxArea;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};
        long start = System.currentTimeMillis();
        System.out.println(MaxArea.solution(heights));
        System.out.println("time : " + (System.currentTimeMillis() - start));
    }
}
