package com.hxlzpnyist.site.leetcode.array;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    public static int solution(int[] nums, int val) {
        int i = 0, count = nums.length, j = count;

        while (true) {
            while (i < j) {
                if (nums[i] == val) {
                    count--;
                    break;
                } else {
                    // 左右指针交汇时退出
                    if (i + 1 == j) {
                        break;
                    }

                    i++;
                }
            }

            while (j > i) {
                j--;

                // 左右指针交汇时退出
                if (j == i) {
                    break;
                }

                if (nums[j] == val) {
                    count--;
                } else {
                    int temp = nums[j];

                    nums[j] = nums[i];
                    nums[i] = temp;

                    i++;

                    break;
                }
            }

            if (i == j) {
                break;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(RemoveElement.solution(new int[]{5,3}, 3));
    }


}
