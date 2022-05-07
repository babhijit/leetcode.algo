package com.leetcode.algo.linkedlist.copy_with_random_ptr;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LinkedListWithRandomPointer {

    private Map<Node, Node> mapper = new HashMap<>();

    public Node copyRandomList(Node head) {
        // head of copied linked list has a dummy head
        Node copyHead = new Node(Integer.MAX_VALUE);
        Node itr = copyHead;

        while(Objects.nonNull(head)) {
            var node = getNodeCopy(head);
            node.random = getNodeCopy(head.random);
            itr.next = node;

            head = head.next;
            itr = itr.next;
        }

        mapper.clear();
        return copyHead.next;
    }

    private Node getNodeCopy(Node original) {
        if (Objects.isNull(original)) {
            return null;
        }

        var copyNode = this.mapper.get(original);
        if (Objects.isNull(copyNode)) {
            copyNode = new Node(original.val);
            this.mapper.put(original, copyNode);
        }

        return copyNode;
    }
}
