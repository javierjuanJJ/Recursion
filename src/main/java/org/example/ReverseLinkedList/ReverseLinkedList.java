package org.example.ReverseLinkedList;


import java.util.HashSet;
import java.util.Set;

public class ReverseLinkedList {

    static class Node{
        public int data;
        public Node right;
        public Node left;
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node() {

        }


        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public HashSet<Node> getNeighboards() {
            return null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);


        printLinkedList(n1);

        Node reversed = reverseList(n1);
        printLinkedList(reversed);

        printLinkedList(mergeList(n1, n2));

        printLinkedList(insertNode(n1, 1));

        printLeaves(n1);

        Set<Node> visited = new HashSet<>();

        System.out.println(depthFirstSearch(n1,visited,1));

    }

    private static boolean depthFirstSearch(Node n1, Set<Node> visited, int goal) {

        if (n1 == null) {
            return false;
        }
        if (n1.val == goal) {
            return true;
        }

        for (Node neightboard :
                n1.getNeighboards()) {
            if (visited.contains(neightboard)){
                continue;
            }
            boolean isFound = depthFirstSearch(neightboard, visited, goal);
            if (isFound) {
                return true;
            }

        }



        return false;
    }

    private static void printLeaves(Node root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print(root.val + ", ");
            }
            else {
                if (root.right != null) {
                    printLeaves(root.right);
                }
                else {
                    printLeaves(root.left);
                }
            }
        }
    }

    private static Node insertNode(Node head, int data) {
        if (head == null) {
            head = new Node();
            head.data = data;
            return head;
        }

        if (head.data < data){
            head.right = insertNode(head.right, data);
        }
        else{
            head.left = insertNode(head.left, data);
        }

        return head;
    }

    private static Node mergeList(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }

        if (n2 == null) {
            return n1;
        }

        if (n1.val <= n2.val) {
            n1.next = mergeList(n1.next, n2);
            return n1;
        }
        else {
            n2.next = mergeList(n1, n2.next);
            return n2;
        }
    }

    private static Node reverseList(Node n1) {

        if (n1 == null || n1.next == null) {
            return n1;
        }
        Node p = reverseList(n1.next);
        n1.next.next = n1;
        n1.next = null;
        return p;
    }

    private static void printLinkedList(Node n1) {
        System.out.println(n1.val);
    }
}
