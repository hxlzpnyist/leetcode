package com.hxlzpnyist.site.leetcode.linked;

import com.hxlzpnyist.site.leetcode.linked.node.BaseLinkedList;
import com.hxlzpnyist.site.leetcode.linked.node.LinkedNode;

/**
 * 判断链表中是否有环
 *
 * @author: zhangping11
 * @date 2019/9/3 14:25
 */
public class CycleLinkedList extends BaseLinkedList {


    private boolean hasCycle (LinkedNode head) {

        LinkedNode fast = head;
        LinkedNode slow = head;

        while (fast != null && slow != null) {
            if (fast == slow) {
                System.out.println("存在环");
                return true;
            }

            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        return false;
    }

    public static void main(String[] args) {





    }



}
