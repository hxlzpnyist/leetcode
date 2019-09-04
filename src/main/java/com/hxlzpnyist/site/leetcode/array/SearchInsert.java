package com.hxlzpnyist.site.leetcode.array;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert {

    public static int Solution(int[] nums, int target) {

        int start = 0, end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        int index = 0;

        if (start >= end) {
            if (nums[start] >= target) {
                index = start;
            } else {
                index = start + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(SearchInsert.Solution(new int[]{3,5, 7, 9,10}, 8));
    }
}
