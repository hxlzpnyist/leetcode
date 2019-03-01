package com.hxlzpnyist.site.leetcode.array;

/**
 * 删除排序数组中的重复元素
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class RemoveDuplicates {

    public static int solution (int[] nums) {
        int i = 0, j = 0;

        while (true) {

            j++;

            if (j >= nums.length) {
                break;
            }

            if (nums[j] == nums[i]) {
                continue;
            } else {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        for (Integer n : nums) {
            System.out.print(n + ",");
        }

        return i + 1;
    }

    public static void main(String[] args) {
        System.out.println(RemoveDuplicates.solution(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
