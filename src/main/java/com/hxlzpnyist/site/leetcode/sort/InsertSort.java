package com.hxlzpnyist.site.leetcode.sort;

/**
 * 插入排序
 *
 * @author: zhangping11
 * @date 2019/9/4 17:06
 */
public class InsertSort {

    private void sort (int[] array) {
        // 时间复杂度为 O(n^2)
        // 将原数组分为两部分，已排序区间和未排序区间; 默认第一个元素为已排序区间
        // 遍历未排序区间，将元素插入到已排序区间合适的位置
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = 0;
            // 从后向前遍历已排序区间
            // 从后向前遍历减少元素的移动
            for (j = i - 1; j >= 0; j--) {
                if (temp < array[j]) {
                    // 该操作相当于将比 temp 大的元素后移
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }

            array[j + 1] = temp;

            println(array);
        }

    }

    private void println (int[] array) {
        for (int a : array) {
            System.out.print(a);
            System.out.print(",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 4, 1, 6, 9};
        new InsertSort().sort(array);
    }
}
