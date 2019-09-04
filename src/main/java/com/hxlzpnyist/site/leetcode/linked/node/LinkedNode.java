package com.hxlzpnyist.site.leetcode.linked.node;

/**
 * 链表节点
 *
 * @author: zhangping11
 * @date 2019/9/3 10:59
 */
public class LinkedNode {

    private Integer value;

    private LinkedNode next;

    public LinkedNode (Integer value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }
}
