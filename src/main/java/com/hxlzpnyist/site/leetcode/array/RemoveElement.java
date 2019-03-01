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
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1 && nums[0] == val) {
            return 0;
        }

        if (nums.length == 1 && nums[0] != val) {
            return 1;
        }

        int i = 0, j = nums.length - 1;

        while (i + 1 <= j) {

            while (true) {
                if (nums[i] == val) {
                    break;
                }

                if (i + 1 <= j) {
                    i++;
                } else {
                    break;
                }
            }

            while (true) {
                if (nums[j] != val) {
                    // 完成交换
                    int temp = nums[j];

                    nums[j] = nums[i];
                    nums[i] = temp;

                    break;
                }

                if (j - 1 >= i) {
                    j--;
                } else {
                    break;
                }
            }
        }

        if (i == nums.length - 1) {
            // 到达末尾
            return nums[i] == val ? i : i + 1;
        } else {
            return nums[i] == val ? i : i - 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(RemoveElement.solution(new int[]{3, 3}, 5));
    }


}
