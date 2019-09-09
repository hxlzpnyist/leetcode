package com.hxlzpnyist.site.leetcode.tree;

import com.hxlzpnyist.site.leetcode.tree.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 按层级遍历二叉树
 *
 * @author: zhangping11
 * @date 2019/9/9 15:04
 */
public class LevelTraversalBinaryTree {

    private static Queue<TreeNode> queue = new LinkedList<>();

    public static void levelTraversal (TreeNode treeNode) {
        queue.add(treeNode);

        TreeNode node = queue.poll();

        while (node != null) {

            System.out.println(node.getValue());

            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }

            node = queue.poll();
        }

    }

    /**
     *       ④
     *    ⑦    ③
     *  ②  ⑤ ⑥
     *
     * @param args
     */
    public static void main(String[] args) {

        TreeNode node2 = new TreeNode();
        node2.setValue(2);

        TreeNode node5 = new TreeNode();
        node5.setValue(5);

        TreeNode node6 = new TreeNode();
        node6.setValue(6);

        TreeNode node7 = new TreeNode();
        node7.setValue(7);
        node7.setLeft(node2);
        node7.setRight(node5);

        TreeNode node3 = new TreeNode();
        node3.setValue(3);
        node3.setRight(node6);

        TreeNode root = new TreeNode();
        root.setValue(4);
        root.setLeft(node7);
        root.setRight(node3);

        LevelTraversalBinaryTree.levelTraversal(root);
    }

}
