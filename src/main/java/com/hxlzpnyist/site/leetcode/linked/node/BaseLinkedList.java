package com.hxlzpnyist.site.leetcode.linked.node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangping11
 * @date 2019/9/3 14:59
 */
public class BaseLinkedList {

    protected LinkedNode getLinkedList (Integer[] values) {
        List<LinkedNode> linkedNodes = new ArrayList<>(values.length);

        for (Integer value : values) {
            linkedNodes.add(new LinkedNode(value, null));
        }

        for (int i = 0; i < linkedNodes.size(); i++) {
            if (i + 1 >= linkedNodes.size()) {
                break;
            }

            linkedNodes.get(i).setNext(linkedNodes.get(i + 1));
        }

        return linkedNodes.get(0);
    }
}
