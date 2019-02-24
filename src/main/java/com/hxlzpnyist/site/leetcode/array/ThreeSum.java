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

        Map<Integer, HashSet<Integer>> rsMap = new HashMap<>();
        List<List<Integer>> rs = new ArrayList<>();

        int i = 0, left = 1, right = nums.length - 1;

        while (i < nums.length - 2) {
            while (true) {
                // 左右指针交叉退出
                if (right <= left) {
                    break;
                }

                if (-nums[i] == nums[left] + nums[right]) {
                    boolean add = true;

                    // 去重
                    if (rsMap.containsKey(nums[i])) {
                        HashSet<Integer> rsValue = rsMap.get(nums[i]);
                        if (rsValue.contains(nums[left]) || rsValue.contains(nums[right])) {
                            add = false;
                        }
                    }

                    if (add) {
                        rs.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        if (rsMap.containsKey(nums[i])) {
                            rsMap.get(nums[i]).add(nums[left]);
                        } else {
                            HashSet<Integer> integers = new HashSet<>();
                            integers.add(nums[left]);

                            rsMap.put(nums[i], integers);
                        }
                    }

                    // 左右指针继续向中间移动
                    left++;
                    right--;
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

            i++;
            left = i + 1;
            right = nums.length - 1;
        }

        return rs;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};

        solution(nums);
    }
}
