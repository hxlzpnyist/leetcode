package com.hxlzpnyist.site.leetcode.linked;

import com.hxlzpnyist.site.leetcode.linked.node.BaseLinkedList;
import com.hxlzpnyist.site.leetcode.linked.node.LinkedNode;

/**
 * 单链表反转
 *
 * 遍历链表，将链表节点的后继指针指向前置节点; 从而实现反转的效果
 *
 * @author: zhangping11
 * @date 2019/9/3 10:46
 */
public class ReverseLinkedList extends BaseLinkedList {

    private LinkedNode reverseLinkedList (LinkedNode head) {

        LinkedNode prev = null;
        LinkedNode temp = null;

        while (head != null) {
            temp = head;
            head = head.getNext();

            temp.setNext(prev);
            prev = temp;
        }

        return temp;
    }

    private void printLinkedList (LinkedNode head) {
        while (head != null) {
            System.out.println(head.getValue());
            head = head.getNext();
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        LinkedNode linkedNode = reverseLinkedList.getLinkedList(new Integer[]{9, 1, 2, 4});
        linkedNode = reverseLinkedList.reverseLinkedList(linkedNode);

        reverseLinkedList.printLinkedList(linkedNode);
    }
}
