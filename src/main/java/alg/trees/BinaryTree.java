package alg.trees;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

public class BinaryTree {
    //BT functions
    //BT adv: has best of both worlds of linkedlist and ordered array
    // quick search
    // quick insertion
    // insertions/deletions:  LL better choice
    // reads: arrays better

    Node<Integer> root;
    int size;

    public void insert(Integer val) {
        if (root == null) {
            root = new Node<>(val, null, null);
        }
        else {
            /* 8 1 4 2
               root = 8
               1 < 8
                8.left = 1
               4 < 8
                but > 1
                1.right = 4
               2 < 8
                but > 1
                but < 4
                4.left = 2


             */

            if (val < root.data) {
                // get left
                Node temp = root.left;
//                while () {
//
//                }
            }
        }
    }


    @Data
    class Node<Integer> { //todo use generics
        // private scope not used on-purpose for ease of use inside calling. getters are verbose :-)
        // In real code, use proper scoping ex: private / protected as deemed necessary
        Integer data;
        Node<Integer> left;
        Node<Integer> right;

        public Node(Integer data, Node<Integer> left, Node<Integer> right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
