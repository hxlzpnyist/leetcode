package com.hxlzpnyist.site.leetcode.sort;

/**
 * 选择排序
 *
 * @author: zhangping11
 * @date 2019/9/4 19:08
 */
public class SelectionSort {

    private void sort (int[] array) {

        // 选择排序同插入排序类似，将原数组区分为已排序区间和未排序区间
        // 从未排序区间选择最小的元素将其添加到已排序区间的末尾
        println(array);

        for (int i = 0; i < array.length; i++) {
            int j = i;
            int min = array[j];
            int minIndex = j;

            for (; j < array.length; j++) {
                if (j + 1 == array.length) {break;}

                if (min > array[j + 1]) {
                    min = array[j + 1];
                    minIndex = j + 1;
                }
            }

            array[minIndex] = array[i];
            array[i] = min;

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
        new SelectionSort().sort(array);
    }
}
