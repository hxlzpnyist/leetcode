package com.hxlzpnyist.site.leetcode.array;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * @url https://leetcode-cn.com/problems/3sum/
 */
public class ThreeSum {

    public static List<List<Integer>> solution(int[] nums) {
        // 排序
        Arrays.sort(nums);

        List<List<Integer>> rs = new ArrayList<>();

        int i = 0, left = 1, right = nums.length - 1;

        while (i < nums.length - 2) {
            while (true) {
                // 左右指针交叉退出
                if (right <= left) {
                    break;
                }

                if (-nums[i] == nums[left] + nums[right]) {
                    rs.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // 过滤同一结果内重复的数字
                    // 左右指针继续向中间移动
                    while (true) {
                        if (left >= nums.length - 1) {
                            break;
                        }

                        if (nums[left] != nums[left + 1]) {
                            left++;
                            break;
                        } else {
                            left++;
                        }
                    }

                    while (true) {
                        if (right <= 0) {
                            break;
                        }

                        if (nums[right] != nums[right - 1]) {
                            right--;
                            break;
                        } else {
                            right--;
                        }
                    }

                    continue;
                }

                if (-nums[i] <= nums[left] + nums[right]) {
                    right--;
                    continue;
                }

                if (-nums[i] > nums[left] + nums[right]) {
                    left++;
                    continue;
                }
            }

            // 过滤同一结果值的数字
            while (true) {
                if (i >= nums.length - 1) {
                    break;
                }

                if (nums[i] != nums[i + 1]) {
                    i++;
                    break;
                } else {
                    i++;
                }
            }

            //i++;
            left = i + 1;
            right = nums.length - 1;
        }

        return rs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0};

        solution(nums);
    }
}
